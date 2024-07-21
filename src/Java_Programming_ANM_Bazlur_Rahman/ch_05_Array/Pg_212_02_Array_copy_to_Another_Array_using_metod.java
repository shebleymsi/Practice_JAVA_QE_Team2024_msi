package Java_Programming_ANM_Bazlur_Rahman.ch_05_Array;

import java.util.Arrays;

public class Pg_212_02_Array_copy_to_Another_Array_using_metod {
    public static void main(String[] args) {
        int[] sourceArray = new int[10]; // Initialize the source array with a size of 10
        // Populate the source array with values for demonstration
        for (int i = 0; i < sourceArray.length; i++) {
            sourceArray[i] = i; // Assign values 0 to 9 to the array
        }
        System.out.println("Source array: " + Arrays.toString(sourceArray));

        int[] copyToArray = new int[20]; // Initialize the target array with the same size
        System.arraycopy(sourceArray, 5, copyToArray, 11, 4); // included.
        //This statement copies 4 elements(length) from the sourceArray starting at index 5(srcPos)
        // >>> to the copyToArray starting at index 11(desPos).

        // srcPos: index 5
        // desPos: index 11
        // source length: length 4

        // Print the copied array
        System.out.println("Copied array: " + Arrays.toString(copyToArray));
    }


}
