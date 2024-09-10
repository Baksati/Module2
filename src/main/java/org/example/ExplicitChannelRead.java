package org.example;

// Использование канального ввода-вывода для чтения файла.

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filepath = null;

        // Сначала получить путь к файлу.
        try {
            filepath = Path.of("test.txt");
        } catch (InvalidPathException e) {
            System.out.println("Ошибка в пути: " + e);
            return;
        }

        // Затем получить канал к этому файлу внутри блока try с ресурсами.
        try(SeekableByteChannel fChan = Files.newByteChannel(filepath))
        {
            // Выделить память под буфер.
            ByteBuffer mBuf = ByteBuffer.allocate(128);

            do {
                // Читать данные в буфер.
                count = fChan.read(mBuf);

                // Остановиться, когда достигнут конец файла.
                if(count != -1) {
                    // Переустановить буфер в начало, чтобы из него можно было читать.
                    mBuf.rewind();
                    // Прочитать байты из буфера и отобразить их на экране как символы.
                    for(int i = 0; i < count; i ++)
                        System.out.print((char) mBuf.get());
                }
            } while (count != -1);
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
