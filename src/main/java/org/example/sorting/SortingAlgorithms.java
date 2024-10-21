package org.example.sorting;

import java.util.Arrays;

public class SortingAlgorithms {
    /*
    Encontrar o MAIOR valor e joga-lo par ao final da lista.
    */
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

    /*
    Encontrar o MENOR valor e joga-lo par ao inicio da lista.
    */
    public static int[] selectionSort(int[] arrayToSort){
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
        return arrayToSort;
    }

    /*
    Encontrar o MENOR valor e separa-lo da lista. Mover os MAIORES valores para a direita até que sobre a posição para inserir o MENOR valor.
    */
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

    public static int[] reimplementation(int[] array){
        int temp = 0;
        int arraySize = array.length - 1;

        for(int i = 0; i< arraySize; i++){
            for(int j = 0; j < arraySize - i; j++){
                System.out.println(Arrays.toString(array));
                if(array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

}
