package midTermPractice.problemAndSolutions_01;

import java.util.Arrays;

public class ArraySort_05_Insertion_Sort {
    //write a Java program to sort an integer array of 5 elements in ascending.
    // [using by Learn InsertionSort]

    // Note:
    // rich-poor problem: rich always want to move right side.
    // Greater number is always rich than the lower number.

//        Example:
//        int[] arr = {3, 0, 1, 8, 7, 2};

//        int[] arr = {0, 3, 1, 8, 7, 2};
//        int[] arr = {0, 1, 3, 8, 7, 2};

//        int[] arr = {0, 1, 3, 8, 7, 2};
//        int[] arr = {0, 1, 3, 7, 8, 2};
//        int[] arr = {0, 1, 3, 7, 2, 8};

//        int[] arr = {0, 1, 3, 2, 7, 8};
//        int[] arr = {0, 1, 2, 3, 7, 8};

    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 8, 7, 2};

        // Call and Printing the sorted array
        System.out.println("Sorted array:"+Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            for (; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}


