package com.algos;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountingSort {

    private static Map<Integer, Integer> countingMap = new TreeMap<>();

    public static void sort(int[] array){
        count(array);
        int index = 0;

        for(int key: countingMap.keySet()){
           int value = countingMap.get(key);

           while (value-- > 0) {
               array[index++] = key;
           }
        }
    }

    private static void count(int[] array){
        for(int i : array){
            countingMap.merge(i, 1, Integer::sum);
        }
    }
}
