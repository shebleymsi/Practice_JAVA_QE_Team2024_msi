package group_ProblemsPractice_RU_2024.group_05_Array;

public class Array_09_Search_new { //done
/**
 Objective of the Code:
 The objective of the code is to search for a specific element (the target value) within an array
 and determine its index.
 If the target value is found, the program prints the index at which it was found;
 otherwise, it prints a message indicating that the element is not present in the array.
 */
    public static void main(String[] args) {
        // Initialize the array with given elements
        int[] array = {10, 20, 30, 40, 50};

        // The target value to search for in the array
        int target = 50;

        // Initialize index to -1 to indicate not found by default
        int index = -1; //  int index = 0;

        // Iterate over each element in the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element is equal to the target value
            if (array[i] == target) {
                // If found, set index to the current position
                index = i;
                // Exit the loop once the target is found
                break;
            }
        }

        // Check if the target value was found in the array
        if (index != -1) {
            // If found, print the index of the target value
            System.out.println("Element --> " + target + " found at index: " + index);
        } else {
            // If not found, print that the element is not in the array
            System.out.println("Element not found in the array.");
        }
    }
}