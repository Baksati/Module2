// Демонстрация работы итераторов.
package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        // Создать списковый массив.
        ArrayList<String> al = new ArrayList<>();
        // Добавить элементы в списковый массив.
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        // Использовать иттератор для отображения содержимого al.
        System.out.print("Исходное содержимое al:");
        Iterator<String> itr = al.iterator();
        while(itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + "");
        }
        System.out.println();
        // Модифицировать объекты в ходе итерации.
        ListIterator<String> litr = al.listIterator();
        while(litr.hasNext()) {
            String element = litr.next();
            System.out.print(element + "+");
        }
        System.out.print("Модифицированное содержимое al:");
        itr = al.iterator();
        while(itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + "");
        }
        System.out.println();
        // Отобразить список в обратном порядке.
        System.out.print("Модифицированный список в обратном порядке :");
        while(litr.hasPrevious()) {
            String element = litr.previous();
            System.out.print(element + "");
        }
        System.out.println();
    }
}
