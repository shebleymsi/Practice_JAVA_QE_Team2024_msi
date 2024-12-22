package problems_midTermPractice_2022_2024_group.practice_03_mathproblems;

import java.util.Scanner;

public class Math_07_FindMissingNumber_02 {
    /*
     * If n = 10, then array will have 9 elements in the range from 1 to 10.
     * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}.
     * One number will be missing in array (9 in this case).
     *
     * Write Java code to find the missing number from the array.
     * Write a static helper method to find it.
     */
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter the total number of elements in the array
        System.out.print("Enter the total number of elements (length of an array): ");
        int n = input.nextInt();
        // Initialize an array of size n to store the elements
        int array[] = new int[n];
        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }


        // Find the missing number using the helper method
        int missingNumber = findMissingNumber(array, n);
        // Print the missing number
        System.out.println("Missing Element is " + missingNumber);
    }

    // Static helper method to find the missing number
    public static int findMissingNumber(int[] array, int n) {
        // Calculate the expected sum of numbers from 1 to n+1
        int sum = (n + 1) * (n + 2) / 2;

        // Subtract each element in the array from the expected sum
        for (int i = 0; i < n; i++) {
            sum = sum - array[i];
        }
        // Return the remaining value of sum, which is the missing number
        return sum;
    }
}
