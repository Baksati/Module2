package org.example;

import java.util.HashSet;
import java.util.Set;

public class FindDublicates {
    public static boolean containsDublicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int element : array) {
            if (!set.add(element)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {4, 5, 6, 6, 8};
        System.out.println(containsDublicates(array1));

        int[] array2 = {4, 5, 6, 7, 8};
        System.out.println(containsDublicates(array2));
    }
}
