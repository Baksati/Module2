package org.example;
// Использование объекта BufferedReader для чтения символов с консоли.

import java.io.*;

public class BRRead {
    public static void main (String[] args) throws IOException
    {
        char c;
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));

        System.out.println("Вводите символы; для выхода введения q.");
        // Читать символы.
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
