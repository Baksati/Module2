package org.example;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] array, int target) {
        int[] result = new int[2];

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        throw new
                IllegalArgumentException("No two elements sum up to the target");
    }

    public static void main(String[] args) {
        int[] array = {3, 8, 15, 17};
        int target = 23;
        int[] result = twoSum(array, target);

        System.out.println(Arrays.toString(result)); // [1, 2]
    }
}
