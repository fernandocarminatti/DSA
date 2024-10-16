package org.example;

import org.example.search.SearchAlgorithms;

public class Main {
    public static void main(String[] args) {
        int[] array = NumbersGenerator.getNumbersArray();
        int target = NumbersGenerator.getTarget();
        String baseTargetResponse = "Base target number was set to -> " + target;
        System.out.println(baseTargetResponse);

        int linearSearchFound = SearchAlgorithms.linearSearch(array, target);
        int binarySearchFound = SearchAlgorithms.binarySearch(array, target);

        String linearSearchResponse = linearSearchFound != -1 ? "Linear Search result: " + target + " at index " + linearSearchFound : "Linear Search Result: " + target + " not found.";
        String binarySearchResponse = binarySearchFound != -1 ? "Binary Search result: " + target + " at index " + binarySearchFound : "Binary Search Result: " + target + " not found.";

        System.out.println(linearSearchResponse);
    }
}