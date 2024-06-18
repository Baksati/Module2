package org.example;

import java.util.Arrays;

public class FindSumIndices {
    public static void main(String[] args) {
        int[] array = {3, 8, 15, 17};
        int number = 23;
        int[] result = FindSumIndices(array, number);

        System.out.println(Arrays.toString(result));
    }

    public static int[] FindSumIndices(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == number) {
                    return new int[]{array[i], array[j]};
                }
            }
        }
        return new int[0];
    }
}
