package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        List arrayList = new ArrayList<>();

        System.out.println("Adding elements into arrayList...");

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Initial arrayList content (using iterator): ");

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n ================ \n");

        System.out.println("Updating elements using ListIterator...");

        ListIterator listIterator = arrayList.listIterator();

        while (listIterator.hasNext()) {
            Integer element = (Integer) listIterator.next();
            listIterator.set(element * 10);
        }

        System.out.println("\n ================ \n");

        System.out.println("Final arrayList content (using iterator): ");
        iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\n ================ \n");

        System.out.println("Final arrayList content (using listIterator): ");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }

        System.out.println("\n ================ \n");
    }
}
