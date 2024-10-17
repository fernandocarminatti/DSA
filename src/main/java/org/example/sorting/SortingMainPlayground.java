package org.example.sorting;

import org.example.NumbersGenerator;

import java.util.Map;

public class SortingMainPlayground {
    public static void main(String[] args) {
        int[] arrayToBeSorted = NumbersGenerator.getUnsortedNumbersArray();

        String bubbleSortResult = SortingAlgorithms.bubbleSort(arrayToBeSorted);
        String selectionSortResult = SortingAlgorithms.selectionSort(arrayToBeSorted);

        System.out.println(bubbleSortResult);
        System.out.println(selectionSortResult);

    }
}
