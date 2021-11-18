package com.algos;

public class InsertionSort {
    public static void sort(int[] array) {

        //{5, -1, 22, 14, 10, 9, -21};

        insertionSort(1, array);
    }

    private static void insertionSort(int firstUnsortedIndex, int[] array){
        if(firstUnsortedIndex>array.length-1){
            return;
        }

        int newElement = array[firstUnsortedIndex];

        int i;

        for(i = firstUnsortedIndex; i>0&&array[i-1]>newElement; i--){
            array[i] = array[i-1];
        }

        array[i] = newElement;
        insertionSort(++firstUnsortedIndex, array);
    }
}
