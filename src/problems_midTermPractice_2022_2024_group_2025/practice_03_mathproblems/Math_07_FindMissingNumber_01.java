package problems_midTermPractice_2022_2024_group_2025.practice_03_mathproblems;

import java.util.Scanner;

public class Math_07_FindMissingNumber_01 {
    /*
     * If n = 10, then array will have 9 elements in the range from 1 to 10.
     * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}.
     * One number will be missing in array (9 in this case missing).
     * Write java code to find the missing number from the array.
     * Write static helper method to find it. [msi - try next]
     */
    public static void main(String[] args) {

        //=============================================================================
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter the total number of elements in the array
        System.out.print("Enter the total number of elements (length of an array): ");
        // Read the number of elements from the user
        int n = input.nextInt();
        // Initialize an array of size n to store the elements
        int array[] = new int[n];
        //=============================================================================


        //=============================================================================
        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");
        // Loop through the array and read each element from the user
        for (int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }
        //=============================================================================


        //=============================================================================
        // Calculate the expected sum of numbers from 1 to n+1
        int sum = (n + 1) * (n + 2) / 2;
        // Subtract each element in the array from the expected sum
        for (int i = 0; i < n; i++) {
            sum = sum - array[i];
        }

        // Print the missing element, which is the remaining value of sum
        System.out.println("Missing Element is " + sum);
    }
}
