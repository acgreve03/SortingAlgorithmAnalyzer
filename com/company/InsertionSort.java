package com.company;


public class InsertionSort implements SortingAlgorithm  {

    public int[] sorty(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int current = input[i];

            int j = i - 1;
            while (j >= 0 && input[j] > current) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = current;
        }
        return input;
    }


    @Override
    public String toString() {
        return "Insertion Sort";
    }
}
