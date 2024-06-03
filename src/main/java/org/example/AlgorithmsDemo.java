package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        List arrayList = new ArrayList<>();

        arrayList.add(-1);
        arrayList.add(53);
        arrayList.add(23);
        arrayList.add(-42);
        arrayList.add(95);
        arrayList.add(12);
        arrayList.add(36);
        arrayList.add(15);

        System.out.println("Initial arrayList:");
        System.out.println(arrayList);

        System.out.println("\n ================== \n");

        System.out.println("Sorting arrayList...");
        Collections.sort(arrayList);
        System.out.println("Inverted arrayList:");
        System.out.println(arrayList);

        System.out.println("\n ================== \n");

        System.out.println("Shuffling arrayList...");
        Collections.shuffle(arrayList);
        System.out.println("Shuffled arrayList:");
        System.out.println(arrayList);

        System.out.println("\n ================== \n");

    }
}
