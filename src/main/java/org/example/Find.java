package org.example;

import java.util.*;

public class Find {
    public static void main(String[] args) {
        int[] array1 = {4, 5, 6, 6, 8, 9};
        System.out.println(containsDuplicate(array1));
        int[] array2 = {4, 5, 6, 7, 8};
        containsDuplicate(array2);

//        array1 = new int[]{4, 5, 6, 6, 8};
//        int previous = 6;
//        for(int nums : array1) {
//            if(previous == nums) {
//                System.out.println(nums);
//            }
//        }


    }

    public static Set<Integer> containsDuplicate(int[] array) {
        List<Integer> numbers = List.of(4, 5, 6, 6, 8, 9);
        List<Integer> numbers2 = List.of(4, 5, 6, 7, 8);
        Set<Integer> set = new HashSet<>();
        List<Object> duplicates = new ArrayList<>();
        numbers.forEach(n -> {
            if (!set.add(n)) {
                duplicates.add(n);
            }
                });
        numbers2.forEach(n2 -> {
            if (!set.add(n2)) {
                duplicates.add(n2);
            }
        });
        System.out.println("Duplicates elements: " + duplicates);
        return set;
    }
}
