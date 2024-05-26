// Использование компаратора для сортировки счетов по фамилии владельца.
package org.example;

import java.util.Comparator;

public class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;

        // Найти индекс начинающийся с фамилии.
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');

        k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
        if (k == 0) // фамилии совпадают, проверить полное имя
            return aStr.compareToIgnoreCase(bStr);
        else
            return k;
    }
    // Переопределять equal() не нужно.
}
