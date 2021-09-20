package com.algos;

public class ShellSort {

    public static void sort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {

                int j = i;

                while (j >= gap && array[j - gap] > array[j]) {
                    Util.swap(array, j, j - gap);
                    j -= gap;
                }
            }
        }
    }
}
