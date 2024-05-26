package org.example;

import java.util.TreeSet;

public class CompDemo {
    public static void main(String[] args) {
        // Создать древовидный набор.
        TreeSet<String> ts = new TreeSet<>(new MyComp());

        // Добавить элементы в древовидный набор.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // Отобразить элементы.
        for(String element : ts)
            System.out.print(element + " ");

        System.out.println();
    }
}
