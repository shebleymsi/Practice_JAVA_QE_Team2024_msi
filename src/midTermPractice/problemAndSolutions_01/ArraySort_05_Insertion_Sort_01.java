package midTermPractice.problemAndSolutions_01;

import java.util.Arrays;

public class ArraySort_05_Insertion_Sort_01 {
    // Objective: Sort an integer array of 6 elements in ascending order using Insertion Sort.
    // [using by Learn InsertionSort]
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 8, 7, 2}; // Initialize an array of integers

        // Call insertionSort to sort the array and print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] arr) {
        // Outer loop to iterate through each element starting from the second element
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // Select the key (current element) to be inserted
            int j = i - 1;    // Initialize j to be the index of the element before the key

            // Inner loop to move elements greater than the key to one position ahead of their current position
            for (; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j]; // Shift elements to the right
            }
            arr[j + 1] = key; // Insert the key into its correct position
        }
        return arr; // Return the sorted array
    }
}

