package com.company;
import java.util.Random;

public class QuickSort implements SortingAlgorithm {

    public int[] sorty(int[] input) {
        return quickSort(input, 0, input.length-1);
    }

    private static int[] quickSort(int[] input, int iLow, int iHigh){

        if(iLow >= iHigh){
            return input;
        }
        int indexOfPivot = new Random().nextInt(iHigh - iLow) + iLow;
        int pivot = input[indexOfPivot];
        swap(input, indexOfPivot, iHigh);

        int lp = iLow, rp = iHigh-1;


        //partitioning
        while(lp < rp){
            while(input[lp] <= pivot && lp < rp){
                ++lp;
            }
            while(input[rp] >= pivot && lp < rp){
                --rp;
            }
            swap(input, lp, rp);
        }
        if(input[lp] > input[iHigh]) {
            swap(input, lp, iHigh);
        }

        else{
            lp = iHigh;
        }

        //recursive call
        quickSort(input, iLow, lp-1);
        quickSort(input, lp+1, iHigh);

        return input;
    }
    private static void swap(int[] arr, int index1, int index2){
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    @Override
    public String toString() {
        return "Quick Sort";
    }
}
