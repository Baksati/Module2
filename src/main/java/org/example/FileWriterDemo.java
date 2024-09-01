package org.example;

// Демонстрация использования FileWriter.

import java.io.*;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String source = "Настало время всем порядочным людям\n" +
                "прийти на помощь своей стране\n" +
                "и заплатить надлежащие налоги,";
        char[] buffer = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);

        try (FileWriter f0 = new FileWriter("file1.txt");
             FileWriter f1 = new FileWriter("file2.txt");
             FileWriter f2 = new FileWriter("file3.txt"))
        {
            // Записать в первый файл.
            for (int i = 0; i < buffer.length; i += 2) {
                f0.write(buffer[i]);
            }
            // Записать во второй файл.
            f1.write(buffer);

            // Записать в третий файл.
            f2.write(buffer, buffer.length - buffer.length / 4, buffer.length / 4);
        } catch (IOException e) {
            System.out.println("Возникла ошибка ввода-вывода");
        }
    }
}
