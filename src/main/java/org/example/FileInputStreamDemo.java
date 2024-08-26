package org.example;

// Демонстрация использования FileInputStream.
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;

        // Применить try с ресурсами для закрытия потока данных.
        try (FileInputStream f =
                new FileInputStream("FileInputStreamDemo.java")) {
            System.out.println("Всего доступно байтов : " + (size = f.available()));

            int n = size/40;
            System.out.println("Первые" + n +
                    "байтов файла, прочитанные по одному с помощью read()");
            for (int i = 0; i < n; i ++) {
                System.out.println((char) f.read());
            }
            System.out.println("\nВсе еще доступно байтов : " + f.available());
            System.out.println("Чтение следующих" + n +
                    "байтов с помощью одного вызова read(b[])");
            byte[] b = new byte[n];
            if (f.read(b) != n) {
                System.err.println("Не удалось прочитать" + n + "байтов.");
            }
            System.out.println(new String(b, 0, n));
            System.out.println("\nВсе еще доступно байтов : "
            + (size = f.available()));
            System.out.println("Пропуск половины оставшихся байтов с помощью skip()");
            f.skip(size/2);
            System.out.println("Все еще доступно байтов : " + f.available());

            System.out.println("Чтение" + n/2 + "байтов в конец массива");
            if (f.read(b, n/2, n/2) != n/2) {
                System.err.println("Не удалось прочитать" + n/2 + "байтов.");
            }
            System.out.println(new String(b, 0, b.length));
            System.out.println("\nВсе еще доступно байтов : " + f.available());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода : " + e);
        }
    }
}
