// Демонстрация работы HashSet.
package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        // Создать хеш-таблицу.
        HashSet<String> hs = new HashSet<>();

        // Добавить элементы в хеш-таблицу.
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println(hs);
    }
}
