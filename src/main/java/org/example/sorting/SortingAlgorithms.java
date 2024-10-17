package org.example.sorting;

public class SortingAlgorithms {
    public static String bubbleSort(int[] arrayToSort) {
        int steps = 0;
        int tempValue = 0;
        int arraySize = arrayToSort.length - 1;

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize - i - 1; j++) {
                steps++;
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    tempValue = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = tempValue;
                }
            }
        }
        return "Bubble Sort steps -> " + steps;
    }

    public static String selectionSort(int[] arrayToSort){
        int steps = 0;
        int minValueIndex = 0;
        int tempValue = 0;
        int arraySize = arrayToSort.length - 1;

        for(int i = 0; i < arraySize; i++){
            minValueIndex = i;
            for(int j = i + 1; j < arraySize; j++){
                steps++;
                if(arrayToSort[minValueIndex] > arrayToSort[j]){
                    minValueIndex = j;
                }
            }
            tempValue = arrayToSort[minValueIndex];
            arrayToSort[minValueIndex] = arrayToSort[i];
            arrayToSort[i] = tempValue;
        }
        return "Selection Sort steps -> " + steps;
    }

    public static String insertionSort(int[] arrayToSort){
        int steps = 0;
        int min = 0;
        int j = 0;
        int arraySize = arrayToSort.length - 1;

        for(int i = 1; i < arraySize; i++){
            min = arrayToSort[i];
            j = i - 1;
            while( j >= 0 && arrayToSort[j] > min) {
                arrayToSort[j+1] = arrayToSort[j];
                j--;
                steps++;
            }
            arrayToSort[j + 1] = min;
            steps++;
        }
        return "Insertion sort steps -> " + steps;
    }

}
