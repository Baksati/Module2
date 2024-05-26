package org.example;

import java.util.Comparator;

public class MyComp implements Comparator<String> {
    public int compare(String aStr, String bStr){

        // Обратить сравение.
        return bStr.compareTo(aStr);
    }
    // Переопределять equals() и методы со стандартной реализацией не требуется.
}
