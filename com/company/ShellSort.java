package com.company;

public class ShellSort implements SortingAlgorithm {

    public int[] sorty(int[] input) {
        for (int gap = input.length / 2; gap > 0; gap /= 2) {
         for(int i = gap; i<input.length; i++){
             int tmp = input[i];
             int j = i;
             while(j >= gap && input[j-gap] > tmp){
                 input[j] = input[j-gap];
                 j -= gap;
             }
             input[j] = tmp;
         }
    }
        return input;
    }

    @Override
    public String toString() {
        return "Shell Sort";
    }
}

