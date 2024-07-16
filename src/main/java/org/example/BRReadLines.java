// Чтение строки консолис применением BufferedReader.
package org.example;

import java.io.*;

public class BRReadLines {
    public static void main(String[] args) throws IOException {

        // Создать объект BufferedReader, используя System.in.
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));

        char str;
        System.out.println("Вводите строки текста.");
        System.out.println("Для завершения введите stop.");
        do {
            str = (char) br.read();
            System.out.println(str);
        } while (str != 'q');
    }
}
