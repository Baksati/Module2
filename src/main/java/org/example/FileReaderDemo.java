package org.example;

// Демонстрация использования FileReader.

import java.io.*;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("FileReaderDemo.java"))
        {
            int c;

            // Прочитать и отобразить содержимое файла.
            while ((c = fr.read()) != -1) System.out.print((char) c);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
