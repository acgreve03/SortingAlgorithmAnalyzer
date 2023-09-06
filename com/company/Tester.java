package com.company;
import java.util.Random;


class Tester {
    SortingAlgorithm sa;

    public Tester(SortingAlgorithm sa){
        this.sa = sa;
    }


    public double singleTest(int size, boolean isRandom){
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            int rand = new Random().nextInt();
            arr[i] = rand;
        }

        if(isRandom == false){
            arr = generateKSorted(size);
        }

        long startTime = System.nanoTime();
        sa.sorty(arr);
        long endTime = System.nanoTime();
        endTime -= startTime;

        double conversionToMilli = endTime / 1000000.0;
        return conversionToMilli;
    }



    public String test(int iterations, int size, boolean isRandom){
        double totalTimeForIterations = 0;
        for(int i = 0; i<iterations; i++){
            totalTimeForIterations += singleTest(size, isRandom);
        }
        double averageTime = totalTimeForIterations / (double)iterations;
        //System.out.printf("%.4f", val);
        return new String ("Sorted " + size + " elements in " + String.format("%.10f", averageTime) + " ms (avg)");
    }

    public int[] generateKSorted(int size){
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            int rand = new Random().nextInt();
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
        return arr;
    }
}