package org.example;

import java.util.Arrays;

public class SumIndexFinder {
    public static void main(String[] args) {
        int[] array = {3, 5, 8, 17};
        int target = 23;
        int[] result = TwoSum(array, target);
        System.out.println(Arrays.toString(result));
    }
}

public static int[] TwoSum(int[] array, int target) {
    int[] result = new int[2];
}