package top_SDET_JAVA_Programs_Kushal_Parikh_CODE_FULL.sdet_03_arrays;

public class SDET_10_Minimum_Maximum {
    // 10.) Find Minimum and Maximum from an Array
    //Minimum value in the array: 1
    // Maximum value in the array: 9
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6, 3};
        // Find maximum and minimum
        int max = findMaximum(array);
        int min = findMinimum(array);
        // Print the results
        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);
    }

    public static int findMaximum(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int max = array[0]; // Initialize max to the first element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if current element is larger
            }
        }
        return max; // Return the maximum value found
    }

    public static int findMinimum(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int min = array[0]; // Initialize min to the first element
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // Update min if current element is smaller
            }
        }
        return min; // Return the minimum value found
    }
}
