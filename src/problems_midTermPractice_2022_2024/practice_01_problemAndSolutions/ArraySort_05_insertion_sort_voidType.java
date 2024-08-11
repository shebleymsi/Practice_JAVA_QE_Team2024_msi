package problems_midTermPractice_2022_2024.practice_01_problemAndSolutions;

import java.util.Arrays;

public class ArraySort_05_insertion_sort_voidType {
    // By using the Insertion_sort algorithm,
    // write a Java program to sort an integer array of 10 elements in ascending order.
    public static void main(String[] args) {
        // Array of 5 elements to be sorted
        //int[] numbers = {20, 10, 9, 15, 2};

        //========================================
        //bubble
        //{20, 10, 9, 15, 2}

        //iteration:01
        // ==> 20, 10, 9, 15, 2
        //10,20,9,15,2
        //10,9,20,15,2
        //10,9,15,20,2
        //10,9,15,2,20

        //iteration:02
        //==>10,9,15,2,20
        //9,10,15,2,20

        //iteration:03
        //==>9,10,15,2,20
        //9,10,2,15,20

        //iteration:04
        //==>9,10,2,15,20
        //9,2,10,15,20

        //iteration:05
        //==>9,2,10,15,20
        //2,9,10,15,20
        //========================================


        //========================================
        //insertion
        //==>{20, 10, 9, 15, 2}

        //iteration:01
        //==>{20, 10, 9, 15, 2}
        //10,20,9,15,2

        //iteration:2
        //==>10,20,9,15,2
        //9,10,20,15,2

        //iteration:03
        //==>9,10,20,15,2
        //9,10,15,20,2

        //iteration:04
        //==>9,10,15,20,2
        //2,9,10,15,20
        //========================================

        // insertion sort
        //========================================
        int[] numbers = {20, 10, 9, 15, 2};
        // Loop through each element in the array
        for (int i = 1; i < numbers.length; i++) {
            // Store the current element to be compared
            int point = numbers[i];
            // Initialize the previous index
            int j = i - 1; //
            // Shift elements of the array that are greater than 'point' to one position ahead

            while (j >= 0 && numbers[j] > point) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            // Place 'point' in its correct position
            numbers[j + 1] = point;
        }

        // Print the sorted array
        System.out.println(Arrays.toString(numbers));
    }
}
