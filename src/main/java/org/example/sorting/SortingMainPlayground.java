package org.example.sorting;

import org.example.NumbersGenerator;

public class SortingMainPlayground {
    public static void main(String[] args) {
        int[] arrayForBubbleSort = NumbersGenerator.getUnsortedNumbersArray();
        int[] arrayForSelectionSort = NumbersGenerator.getUnsortedNumbersArray();
        int[] arrayForInsertionSort = NumbersGenerator.getUnsortedNumbersArray();
        int[] arrayForQuickSort = NumbersGenerator.getUnsortedNumbersArray();

        // O(n²)
        SortingAlgorithms.bubbleSort(arrayForBubbleSort);
        // O(n²)
        SortingAlgorithms.selectionSort(arrayForSelectionSort);
        // O(n²)
        SortingAlgorithms.insertionSort(arrayForInsertionSort);
        // O(n log n) ~ AVERAGE
        // O(n²) ~ WORST.
        SortingAlgorithms.quickSort(arrayForQuickSort, 0, arrayForQuickSort.length - 1);

        String bubbleSortResult = "Bubble sort done.";
        String selectionSortResult = "Selection sort done.";
        String insertionSortResult = "Insertion sort done.";
        String quickSortResult = "Quick sort done.";

        System.out.println(bubbleSortResult);
        System.out.println(selectionSortResult);
        System.out.println(insertionSortResult);
        System.out.println(quickSortResult);

    }
}
