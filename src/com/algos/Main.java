package com.algos;

public class Main {
    public static void main(String[] args) {
        int[] array = {-1, 5, 6, 6 ,8 ,9, 7, 10, 2, 4, 7,100};
        CountingSort.sort(array);
        Util.show(array);
    }
}
