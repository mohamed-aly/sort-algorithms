package com.algos;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int start, int end) {

        if (end - start < 2) return;

        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex - 1);
        quickSort(array, pivotIndex, end);

    }

    //int[] array = {5, -1, 4, 14, 10, 9, -21, 100};
    private static int partition(int[] array, int start, int end) {

        int pivotElement = array[end];
        int i = start;

        for (int j = i; j < end; j++) {
            if (array[j] < pivotElement) {
                Util.swap(array, i, j);
                i++;
            }
        }

        Util.swap(array, i, end);
        return i;
    }
}
