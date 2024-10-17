package org.example.sorting;

import org.example.NumbersGenerator;

import java.util.Arrays;

public class SortingMainPlayground {
    public static void main(String[] args) {
        int[] arrayForBubbleSort = NumbersGenerator.getUnsortedNumbersArray();
        int[] arrayForSelectionSort = NumbersGenerator.getUnsortedNumbersArray();
        int[] arrayForInsertionSort = NumbersGenerator.getUnsortedNumbersArray();

        String bubbleSortResult = SortingAlgorithms.bubbleSort(arrayForBubbleSort);
        String selectionSortResult = SortingAlgorithms.selectionSort(arrayForSelectionSort);
        String insertionSortResult = SortingAlgorithms.insertionSort(arrayForInsertionSort);

        System.out.println(bubbleSortResult);
        System.out.println(selectionSortResult);
        System.out.println(insertionSortResult);

    }
}
