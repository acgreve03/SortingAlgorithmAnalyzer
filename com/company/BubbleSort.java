package com.company;


public class BubbleSort implements SortingAlgorithm  {



    public int[] sorty(int[] input) {
        int tmp;
        int n = input.length;
        for(int i = 0; i< n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(input[j+1] < input[j]){
                   tmp = input[j];
                   input[j] = input[j+1];
                   input[j+1] = tmp;
                }
            }
        }
       return input;
    }

    @Override
    public String toString() {
        return "Bubble Sort";
    }
}
