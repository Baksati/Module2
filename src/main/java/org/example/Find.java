package org.example;

import java.util.*;

public class Find {
    public static void main(String[] args) {
        int[] array1 = {4, 5, 6, 6, 8, 9};
        System.out.println(containsDuplicate(array1));
        int[] array2 = {4, 5, 6, 7, 8};
        System.out.println(containsDuplicate(array2));



//        array1 = new int[]{4, 5, 6, 6, 8};
//        int previous = 6;
//        for(int nums : array1) {
//            if(previous == nums) {
//                System.out.println(nums);
//            }
//        }


    }

    public static boolean containsDuplicate(int[] array1) {
        List<Integer> numbers = new ArrayList<>();
        for (int a: array1)
            numbers.add(a);
        Set<Integer> set = new HashSet<>();
        List<Object> duplicates = new ArrayList<>();
        numbers.forEach(n -> {
            if (!set.add(n)) {
                duplicates.add(n);
            }
                });
        System.out.println("Элементы из списка" + numbers);
        System.out.println("Дублирующий элемент: " + duplicates);

        return !duplicates.isEmpty();
    }
}
