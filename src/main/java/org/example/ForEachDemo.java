// Использование цикла for в стиле "for-each" для прохода по коллекции.
package org.example;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        // Создать списковый массив для целых чисел.
        ArrayList<Integer> vals = new ArrayList<>();

        // Добавить значение в списковый массив.
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        // Использовать цикл for для отображения.
        System.out.print("Содержимое vals :");
        for (int v : vals)
            System.out.print(v + " ");

        System.out.println();

        // Проссумировать значения с применением цикла for.
        int sum = 0;
        for (int v : vals)
            sum += v;

        System.out.println("Сумма значения :" + sum);
    }
}
