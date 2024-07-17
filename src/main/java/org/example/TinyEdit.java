// Крошечный текстовый редактор.
package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {

        // Создать объект BufferedReader, используя System.in.
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));

        String[] str = new String[100];
        System.out.println("Вводите строки текста.");
        System.out.println("Для завершения введите stop.");
        for(int i = 0; i < 100; i ++) {
            str[i] = br.readLine();
            if(str[i].equals("stop")) break;
        }
        System.out.println("\n Вот то, что ввели:");
        // Отобразить строки.
        for(int i = 0; i < 100; i ++) {
            if(str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
    }
}
