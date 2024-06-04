package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetPerfomanceTest {
    public static void main(String[] args) {
        List arrayList = new ArrayList<>();
        TreeSet treeSet = new TreeSet<>();

        System.out.println("Filling our structures...");

        for(int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
            treeSet.add(i);
        }

        System.out.println("Trying to receive element 999,999 in arrayList");

        long start = System.nanoTime();
        arrayList.get(999_999);
        long end = System.nanoTime();

        long timeElapsedArrayList = end - start;

        System.out.println("Time elapsed for ArrayList: " + timeElapsedArrayList);


        System.out.println("Trying to receive element 999,999 in arrayList");

        start = System.nanoTime();
        treeSet.getClass();
        end = System.nanoTime();

        long timeElapsedTreeSet = end - start;

        System.out.println("Time elapsed for TreeSet: " + timeElapsedTreeSet);
        System.out.println("TreeSet" + (int) (timeElapsedArrayList/timeElapsedTreeSet) + "times more effective");

    }
}
