package org.example;

// Демонстрация использования Console.

import java.io.*;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;

        // Получить ссылку на консоль.
        Console con = System.console();
        // Если консоль недоступна, тогда закончить работу.
        if (con == null) return;

        // Прочитать строку и затем отобразить ее.
        str = con.readLine("Введите строку: ");
        con.printf("Введенная строка: %s\n", str);
    }
}
