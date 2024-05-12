// Демонстрация использования LinkedList.
package org.example;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Создать связанный список.
        LinkedList<String> ll = new LinkedList<>();

        // Добавить элементы в связзаный список.
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");

        System.out.println("Исходное содержимое ll:" + ll);

        // Удалить элементы из связного типа.
        ll.remove("F");
        ll.remove(2);

        System.out.println("Содержимое ll после удаления:" + ll);

        // Удалить первый и последний элементы.
        ll.removeFirst();
        ll.removeLast();

        System.out.println("Содержимое ll после удаления первогои " +
                "послденего элементов:" + ll);

        // Получить и установить значение.

        String val = ll.get(2);
        ll.set(2, val + "изменено");

        System.out.println("Содержимое ll после изменения:" + ll);
    }
}
