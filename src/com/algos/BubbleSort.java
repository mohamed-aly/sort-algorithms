package com.algos;

public class BubbleSort {
    public static void sort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    Util.swap(array, i, i + 1);
                }
            }
        }
    }
}
