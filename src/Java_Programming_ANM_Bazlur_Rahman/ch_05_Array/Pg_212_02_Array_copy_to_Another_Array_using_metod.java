package Java_Programming_ANM_Bazlur_Rahman.ch_05_Array;

import java.util.Arrays;

public class Pg_212_02_Array_copy_to_Another_Array_using_metod {
    public static void main(String[] args) {
        int[] sourceArray = new int[10]; // Initialize the source array with a size of 10
        // Populate the source array with values for demonstration
        for (int i = 0; i < sourceArray.length; i++) {
            sourceArray[i] = i; // Assign values 0 to 9 to the array
        }

        int[] copyToArray = new int[20]; // Initialize the target array with the same size
        System.arraycopy(sourceArray, 5, copyToArray, 11, 4);
        //This statement copies 5 elements(length:5) from the sourceArray starting at index 5 to the copyToArray starting at index 10.

        // Print the copied array
        System.out.println("Copied array: " + Arrays.toString(copyToArray));
    }


}
