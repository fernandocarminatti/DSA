package org.example.sorting;

import org.example.NumbersGenerator;

import java.util.Arrays;

public class SortingMainPlayground {
    public static void main(String[] args) {

        int[] array = NumbersGenerator.getUnsortedNumbersArray();

        // O(n²)
        //SortingAlgorithms.bubbleSort(arrayForBubbleSort);
        // O(n²)
        //SortingAlgorithms.selectionSort(arrayForSelectionSort);
        // O(n²)
        //SortingAlgorithms.insertionSort(arrayForInsertionSort);
        // O(n log n) ~ AVERAGE
        // O(n²) ~ WORST.
        int[] sorted = SortingAlgorithms.selectionSort(array);
        //int[] sorted2 = SortingAlgorithms.selectionSort(array);

        System.out.println("Sorting Done!");
        System.out.println(Arrays.toString(sorted));
    }
}
