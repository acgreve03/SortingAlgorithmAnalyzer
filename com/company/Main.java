package com.company;

import java.util.Arrays;
import java.util.Random;

interface SortingAlgorithm{

  int[] sorty(int[] input);
}
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for(int i = 0; i<arr.length; i++){
            int rand = new Random().nextInt(50);
            arr[i] = rand;
        }
        int gap = 10;
        for(int i = gap; i<arr.length; i++){
            int tmp = arr[i];
            int j = i;
            while(j >= gap && arr[j-gap] > tmp){
                arr[j] = arr[j-gap];
                j -= gap;
            }
            arr[j] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
