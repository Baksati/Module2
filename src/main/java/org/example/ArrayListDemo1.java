package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        List arrayList = new ArrayList<>();

        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.add("Fourth");
        arrayList.add("Fifth");

        System.out.println("Initial size of ArrayList: " + arrayList.size());
        System.out.println("Initial arrayList content: " + arrayList);

        arrayList.remove("Third");
        arrayList.remove(1);

        System.out.println("Final size of arrayList: " + arrayList.size());
        System.out.println("Final arrayList content: " + arrayList);
    }
}
