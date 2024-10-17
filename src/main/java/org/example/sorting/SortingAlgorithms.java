package org.example.sorting;

public class SortingAlgorithms {
    public static String bubbleSort(int[] arrayToBeSorted) {
        int steps = 0;
        int tempValue = 0;
        int arraySize = arrayToBeSorted.length - 1;

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize - i - 1; j++) {
                steps++;
                if (arrayToBeSorted[j] > arrayToBeSorted[j + 1]) {
                    tempValue = arrayToBeSorted[j];
                    arrayToBeSorted[j] = arrayToBeSorted[j + 1];
                    arrayToBeSorted[j + 1] = tempValue;
                }
            }
        }
        return "Bubble Sort steps -> " + steps;
    }

    public static String selectionSort(int[] arrayToBeSorted){
        int steps = 0;
        int minValueIndex = 0;
        int tempValue = 0;
        int arraySize = arrayToBeSorted.length - 1;

        for(int i = 0; i < arraySize; i++){
            minValueIndex = i;
            for(int j = i + 1; j < arraySize; j++){
                steps++;
                if(arrayToBeSorted[minValueIndex] > arrayToBeSorted[j]){
                    minValueIndex = j;
                }
            }
            tempValue = arrayToBeSorted[minValueIndex];
            arrayToBeSorted[minValueIndex] = arrayToBeSorted[i];
            arrayToBeSorted[i] = tempValue;
        }
        return "Selection Sort steps -> " + steps;
    }
}
