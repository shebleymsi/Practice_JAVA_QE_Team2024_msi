package GroupProblemsPractice_2024.group_05_Array;

import java.util.Arrays; // Import the Arrays class for array manipulation

public class ArrayDuplicationRemoval_14 { // done

    public static void main(String[] args) {
        // Initialize or given an array with some duplicate elements
        int[] array = {10, 20, 10, 30, 40, 20};

        // Print the original array
        System.out.println("Print the array: " + Arrays.toString(array));

        // Using a temporary array [ such as uniqueArray ] to remove duplicate elements
        // Arrays.stream(array): Converts the array into a stream
        // distinct(): Removes duplicate elements from the stream
        // toArray(): Collects the elements of the stream into a new array
        int[] uniqueArray = Arrays.stream(array).distinct().toArray();

        // Print the array after removing duplicates
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }

}