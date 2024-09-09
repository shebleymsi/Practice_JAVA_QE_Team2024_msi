package java_Programming_ANM_Bazlur_Rahman_2024__RUNNING.ch_05_Array;

import java.util.Arrays;

public class Pg_212_01_Array_copy_to_Another_Array_by_for_loop {
    public static void main(String[] args) {
        int[] sourceArray = new int[10]; // Initialize the source array with a size of 10
        // Populate the source array with values for demonstration
        for (int i = 0; i < sourceArray.length; i++) {
            sourceArray[i] = i; // Assign values 0 to 9 to the array
        }

        int[] copyToArray = new int[20]; // Initialize the target array with the same size
        for (int i = 0; i < sourceArray.length; i++) {
            copyToArray[i] = sourceArray[i]; // Copy values from sourceArray to copyToArray
        }
        // Print the copied array
        System.out.println("Copied array: " + Arrays.toString(copyToArray));
    }

}
