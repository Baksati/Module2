package org.example;

import java.util.Arrays;

public class FindSumIndicesUnique {
    public static void main(String[] args) {
        int[] array = {3, 8, 15, 17};
        int number = 23;

        int[] indices = FindSumIndicesUnique(array, number);

        System.out.println(Arrays.toString(indices));
    }

    public static int[] FindSumIndicesUnique(int[] array, int sum) {
        int[] indices = new int[2];

        for (int i = 0; i < array.length; i++) {
            int target = sum - array[i];

            int index = Arrays.binarySearch(array, i + 1, array.length, target);
            if (index >=0) {
                indices[0] = array [i];
                indices[1] = array [index];
            }
        }
        return indices;
    }
}