package org.example.sorting;

public class SortingAlgorithms {
    public static void bubbleSort(int[] arrayToSort) {
        int tempValue = 0;
        int arraySize = arrayToSort.length - 1;

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize - i - 1; j++) {
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
            for(int j = i + 1; j < arraySize; j++){
                if(arrayToSort[minValueIndex] > arrayToSort[j]){
                    minValueIndex = j;
                }
            }
            tempValue = arrayToSort[minValueIndex];
            arrayToSort[minValueIndex] = arrayToSort[i];
            arrayToSort[i] = tempValue;
        }
    }

    public static void insertionSort(int[] arrayToSort){
        int min = 0;
        int j = 0;
        int arraySize = arrayToSort.length - 1;

        for(int i = 1; i < arraySize; i++){
            min = arrayToSort[i];
            j = i - 1;
            while( j >= 0 && arrayToSort[j] > min) {
                arrayToSort[j+1] = arrayToSort[j];
                j--;
            }
            arrayToSort[j + 1] = min;
        }
    }

    public static void quickSort(int[] arrayToSort, int low, int high){
        if(low < high){
            int pivotIndex = partition(arrayToSort, low, high);

            quickSort(arrayToSort, low, pivotIndex - 1);
            quickSort(arrayToSort, pivotIndex + 1, high);
        }
    }

    public static int partition(int[]array, int low, int high){
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] array, int num01, int num02){
        int temp = array[num01];
        array[num01] = array[num02];
        array[num02] = temp;
    }
}
