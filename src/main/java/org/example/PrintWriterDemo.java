package org.example;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Текстовая строка");
        int i = - 7;
        pw.println(i);
        double d = 4.5e-7;
        pw.println(d);
    }
}
