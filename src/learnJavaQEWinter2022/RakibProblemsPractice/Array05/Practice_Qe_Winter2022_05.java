package learnJavaQEWinter2022.RakibProblemsPractice.Array05;

import java.util.Arrays;

public class Practice_Qe_Winter2022_05 {

    // Given an Array in main method, then find minimum & maximum number,
    // key ref: return type method
    // linear sort an aray

    public static void main(String[] args) {

        int[] array = {4, 2, 7, 1, 9, 3, 5};
        System.out.println("Original array: " + Arrays.toString(array));

        int min = findMin(array);
        System.out.println("Minimum number: " + min);

        int max = findMax(array);
        System.out.println("Maximum number: " + max);

        linearSort(array, min, max);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }


    // ========================================== Lecture Start Here ============================================


    // ======================== Find Minimum number ============================

    /*
    To find the minimum number in an array in Java,
    you can iterate through the array and keep track of the smallest element encountered.
    */
    // given Array: int[] array = {4, 2, 7, 1, 9, 3, 5};
    public static int findMin(int[] array) {

        //Initialize the Minimum: Start by assuming the first element is the minimum.
        int min = array[0];

        //Iterate Through the Array: Loop through the array starting from the second element.
        //If an element is smaller than the current minimum, update the minimum.
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min; //Return the Minimum:
    }

    /* This approach efficiently finds the minimum value in the array with a time complexity of 𝑂(𝑛),
    where 𝑛 is the number of elements in the array.
    */

    // ======================== Find Maximum number ===========================
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // ========================= linear Sort ==================================
    public static void linearSort(int[] array, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[array.length];

        // Count occurrences of each element
        for (int i = 0; i < array.length; i++) {
            count[array[i] - min]++;
        }

        // Place elements in correct position in output array
        int index = 0;
        for (int i = 0; i < range; i++) {
            for (int j = 0; j < count[i]; j++) {
                output[index++] = i + min;
            }
        }

        // Copy sorted elements back to original array
        System.arraycopy(output, 0, array, 0, array.length);
    }
}
