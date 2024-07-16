// Чтение строки консоли c применением BufferedReader.
package org.example;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {

        // Создать объект BufferedReader, используя System.in.
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));

        char c;
        System.out.println("Вводите строки текста.");
        System.out.println("Для завершения введите stop.");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
