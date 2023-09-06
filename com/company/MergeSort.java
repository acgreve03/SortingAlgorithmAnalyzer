package com.company;

public class MergeSort implements SortingAlgorithm  {


    public  int[] sorty(int[] input) {
        int inputLength = input.length;

        if(inputLength < 2){
            return input;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for(int i = 0; i<midIndex; i++){
            leftHalf[i] = input[i];
        }

        for(int j = midIndex; j < inputLength; j++){
            rightHalf[j - midIndex] = input[j];
        }

        sorty(leftHalf);
        sorty(rightHalf);

       return merge(input, leftHalf, rightHalf);
    }

    private static int[] merge(int[] input, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                input[k] = leftHalf[i];
                i++;
            } else {
                input[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            input[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            input[k] = rightHalf[j];
            j++;
            k++;
        }
        return input;
    }

    @Override
    public String toString() {
        return "Merge Sort";
    }
}
