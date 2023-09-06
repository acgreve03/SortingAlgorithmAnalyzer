package com.company;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Performance {
    public static void main(String[] args) throws FileNotFoundException  {


        //int[] testArr = {99,55,33,12,5,76,103,6, 29};

        BubbleSort bubble = new BubbleSort();
        InsertionSort insertion = new InsertionSort();
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();
        SelectionSort selection = new SelectionSort();
        ShellSort shell = new ShellSort();

        int[] sizeArr = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        SortingAlgorithm[] saArray = {bubble, insertion, merge, quick, selection, shell};
        boolean isRandom = true;
        String path = "";

        //put into array and loop through
        if(isRandom == true){
            path = "randomResults";
        }

        else{
            path = "K-SortedResults";
        }

        PrintWriter out = new PrintWriter(path);
        for (SortingAlgorithm sa : saArray) {
           out.println("Sorting Algorithm: " + sa);
            for (int j : sizeArr) {
                Tester theTest = new Tester(sa);
                out.println(theTest.test(20, j, isRandom));
            }
        }
        out.close();
    }
}

