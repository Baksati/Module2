package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Find {
    public static void main(String[] args) {
        int[] array1 = {4, 5, 6, 6, 8, 9};
        System.out.println(containsDuplicate(array1));
//        int[] array2 = {4, 5, 6, 7, 8};
//        containsDuplicate(array2);

//        array1 = new int[]{4, 5, 6, 6, 8};
//        int previous = 6;
//        for(int nums : array1) {
//            if(previous == nums) {
//                System.out.println(nums);
//            }
//        }


    }

    public static Set<Integer> containsDuplicate(int[] array) {
        Set<Integer> set = new HashSet<>();
        // TODO добавить все элементы вне зависимости от колл-ва
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(6);
        set.add(8);
        set.add(9);
        return set;
    }
}
