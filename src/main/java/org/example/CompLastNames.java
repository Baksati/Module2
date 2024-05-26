// Использование thenComparing() для сортировки счетов по фамилии
// а затем по имени владельца.
package org.example;

import java.util.Comparator;

public class CompLastNames implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;

        // Найти индекс начала фамилии.
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');

        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}
