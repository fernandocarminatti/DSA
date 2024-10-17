package org.example.search;

import org.example.NumbersGenerator;

public class SearchMainPlayground {
    public static void main(String[] args) {
        int[] array = NumbersGenerator.getNumbersArray();
        int target = NumbersGenerator.getTarget();
        String baseTargetResponse = "Base target number was set to -> " + target;
        System.out.println(baseTargetResponse);

        int linearSearchFound = SearchAlgorithms.linearSearch(array, target);
        int binarySearchFound = SearchAlgorithms.binarySearch(array, target);
        int binarySearchRecursiveFound = SearchAlgorithms.binarySearchRecursive(array, target, 0, array.length - 1);

        String linearSearchResponse = linearSearchFound != -1 ? "Linear Search result: " + target + " at index " + linearSearchFound : "Linear Search Result: " + target + " not found.";
        String binarySearchResponse = binarySearchFound != -1 ? "Binary Search result: " + target + " at index " + binarySearchFound : "Binary Search Result: " + target + " not found.";
        String binarySearchRecursiveResponse = binarySearchRecursiveFound != -1 ? "Binary Search Recursive result: " + target + " at index " + binarySearchRecursiveFound : "Binary Search Recursive Result: " + target + " not found.";

        System.out.println(binarySearchRecursiveResponse);
    }
}
