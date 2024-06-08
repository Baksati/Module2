package org.example;

import java.util.HashSet;
import java.util.Set;

public class Find {
    public static boolean containsDuplicate(int[] array) {
        Set<Integer> set = new HashSet<>();
        for(int nums : array) {
            if(!set.contains(nums)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {4, 5, 6, 6, 8};
        System.out.println(containsDuplicate(array1));

        int[] array2 = {4, 5, 6, 7, 8};
        System.out.println(containsDuplicate(array2));
    }
}