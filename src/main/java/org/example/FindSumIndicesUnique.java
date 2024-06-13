package org.example;

import java.util.Arrays;

public class FindSumIndicesUnique {
    public static void main(String[] args) {
        int[] arr = {3, 8, 15, 17};
        int sum = 23;

        int[] indices = FindSumIndicesUnique(arr, sum);

        System.out.println(Arrays.toString(indices));
    }

    public static int[] FindSumIndicesUnique(int[] arr, int sum) {
        int[] indices = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int target = sum - arr[i];

            int index = Arrays.binarySearch(arr, i + 1, arr.length, target);

            if (index >= 0) {
                indices[0] = arr [i];
                indices[1] = arr [index];
                return indices;
            }
        }
        return indices;
    }
}
