package com.company;

public class SelectionSort implements SortingAlgorithm {

    public int[] sorty(int[] input) {

        for (int i = 0; i < input.length-1; i++) {
            int min = i;
            for (int j = i; j < input.length; j++) {
                if (input[min] > input[j]) {
                    min = j;
                }
            }
            int tmp = input[i];
            input[i] = input[min];
            input[min] = tmp;
        }
        return input;
    }

    @Override
    public String toString() {
        return "Selection Sort";
    }
}
