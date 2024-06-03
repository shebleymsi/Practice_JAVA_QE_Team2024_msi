package learnJavaQEWinter2022.RakibProblemsPractice.Array05;

import java.util.Arrays;

public class ArrayConcatenation_10 { //done

    /**
     * Objective of the Code
     * The objective of the code is to concatenate two arrays into a single array,
     * combining all the elements of the first array with all the elements of the second array.
     * The result is printed to the console.
     */
    public static void main(String[] args) {
        // 01. Initialize the first array with elements
        String[] array1 = {"apple", "banana", "cherry"};

        // 02. Initialize the second array with elements
        String[] array2 = {"date", "elderberry"};

        // 03. Creating a new array to hold the concatenated elements
        String[] concatenatedArray = new String[array1.length + array2.length];

        // Copying elements from array1 to concatenatedArray
        System.arraycopy(array1, 0, concatenatedArray, 0, array1.length);

        // Copying elements from array2 to concatenatedArray starting from the end of array1
        System.arraycopy(array2, 0, concatenatedArray, array1.length, array2.length);

        // Print the concatenated array
        System.out.println("Concatenated array: " + Arrays.toString(concatenatedArray));
    }
}