package org.example.sorting;

import java.util.Arrays;

public class SortingAlgorithms {

    public static void bubbleSort(int[] arrayToSort) {
        int tempValue = 0;
        int arraySize = arrayToSort.length - 1;

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize - i; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    tempValue = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = tempValue;
                }
            }
        }
    }

    public static void selectionSort(int[] arrayToSort){
        int minValueIndex = 0;
        int tempValue = 0;
        int arraySize = arrayToSort.length - 1;

        for(int i = 0; i < arraySize; i++){
            minValueIndex = i;
            for(int j = i + 1; j < arraySize + 1; j++){
                if(arrayToSort[minValueIndex] > arrayToSort[j]){
                    minValueIndex = j;
                }
            }
            tempValue = arrayToSort[minValueIndex];
            arrayToSort[minValueIndex] = arrayToSort[i];
            arrayToSort[i] = tempValue;
        }
    }

    public static void insertionSort(int[] array){
        int arrSize = array.length;

        for(int i = 0; i < arrSize; i++){
            int min = array[i];
            int j = i - 1;
            while(j>=0 && array[j] > min){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = min;
        }
    }

    public static void quickSort(int[] arrayToSort, int low, int high){
        if(low < high){
            int pivotIndex = partition(arrayToSort, low, high);

            quickSort(arrayToSort, low, pivotIndex - 1);
            quickSort(arrayToSort, pivotIndex + 1, high);
        }
    }

    public static int partition(int[]array, int lowBound, int highBound){
        int pivot = array[highBound];
        int i = lowBound - 1;

        for (int j = lowBound; j < highBound; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, highBound);
        return i + 1;
    }

    public static void swap(int[] array, int num01, int num02){
        int temp = array[num01];
        array[num01] = array[num02];
        array[num02] = temp;
    }

    public static void reimplementation(int[] array)    {
        int minIdx = 0;
        int arraySize = array.length - 1;

        for(int i = 0; i < arraySize; i++){
            minIdx = i;
            for(int j = i + 1; j < arraySize + 1; j++){
                if(array[minIdx] > array[j]){
                    minIdx = j;
                }
            }
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }


}
