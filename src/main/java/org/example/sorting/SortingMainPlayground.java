package org.example.sorting;

import org.example.NumbersGenerator;

import java.util.Arrays;

public class SortingMainPlayground {
    public static void main(String[] args) {

        int[] array = NumbersGenerator.getUnsortedNumbersArray();
        System.out.println(Arrays.toString(array) + " <- Original Array");
        System.out.println();
        SortingAlgorithms.reimplementation(array);
        System.out.println(Arrays.toString(array) + " <- Sorted!");
        System.out.println();
    }
}
