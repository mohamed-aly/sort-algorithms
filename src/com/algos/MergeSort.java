package com.algos;

public class MergeSort {

    public static void sort(int[] array) {
        mergeSort(array, 0, array.length);
    }

    private static void mergeSort(int[] array, int start, int end) {

        if (end - start < 2) return;

        int mid = (end + start) / 2;

        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);

    }

    private static void merge(int[] array, int start, int mid, int end) {
        if (array[mid - 1] > array[mid]) return;

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] tempArray = new int[end - start];

        while (i < mid && j < end) {
            tempArray[tempIndex++] = array[i] > array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(tempArray, 0, array, start, tempIndex);
    }
}
