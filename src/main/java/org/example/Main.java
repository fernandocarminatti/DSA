package org.example;

import org.example.search.SearchAlgorithms;

public class Main {
    public static void main(String[] args) {
        int[] array = NumbersGenerator.getNumbersArray();
        int target = NumbersGenerator.getTarget();
        int linearSearchFound = SearchAlgorithms.linearSearch(array, target);
        int binarySearchFound = SearchAlgorithms.binarySearch(array, target);

        String baseTargetResponse = "Base target number was set to -> " + target;
        String baseLinearResponse = linearSearchFound != -1 ? "Linear Search result: " + target + " at index " + linearSearchFound : "Linear Search Result: " + target + " not found.";
        String baseBinaryResponse = binarySearchFound != -1 ? "Binary Search result: " + target + " at index " + linearSearchFound : "Binary Search Result: " + target + " not found.";

        System.out.println(baseTargetResponse);
        System.out.println(baseLinearResponse);
        System.out.println(baseBinaryResponse);
    }
}