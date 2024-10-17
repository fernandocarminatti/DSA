package org.example.sorting;

public class SortingAlgorithms {
    public static String bubbleSort(int[] arrayToBeSorted) {
        int steps = 0;
        int tempValue = 0;
        int listSize = arrayToBeSorted.length - 1;

        for (int i = 0; i < listSize; i++) {
            for (int j = 0; j < listSize - i - 1; j++) {
                if (arrayToBeSorted[j] > arrayToBeSorted[j + 1]) {
                    tempValue = arrayToBeSorted[j];
                    arrayToBeSorted[j] = arrayToBeSorted[j + 1];
                    arrayToBeSorted[j + 1] = tempValue;
                    steps++;
                }
            }
        }
        return "Steps taken -> " + steps;
    }
}
