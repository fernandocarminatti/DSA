package org.example.search;

public class SearchAlgorithms {

    public static int linearSearch(int[] array, int key) {

        // Simple iteration on the array. O(n)

        int steps = 0;

        for (int i = 0; i < array.length; i++) {
            steps++;
            if (array[i] == key) {
                System.out.println("Linear search steps: " + steps);
                return i;
            }
        }
        System.out.println("Linear search steps: " + steps);
        return -1;
    }

    public static int binarySearch(int[] array, int key) {
        // "Divide and Conquer" on each iteration,
        // checks for middle value and GREAT or LESS than TARGET,
        // length of array search is

        int steps = 0;
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            steps++;
            if (array[mid] == key) {
                System.out.println("Binary search steps: "+ steps);
                return mid;
            } else if (array[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Binary search steps: "+ steps);
        return -1;
    }

}
