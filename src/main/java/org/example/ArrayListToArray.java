// Преобразование ArrayList в массив.
package org.example;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        // Создать списковый массив.
        ArrayList<Integer> a1 = new ArrayList<Integer>();

        // Добавить элементы в списковый массив.
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        System.out.println("Содержимое a1:" + a1);

        // Получить массив.
        Integer[] ia = new Integer[a1.size()];
        ia = a1.toArray(ia);
        int sum = 0;

        // Просуммировать элементы массива.
        for(int i : ia) sum += i;
        System.out.println("Сумма элементов массива:" + sum);
    }
}
