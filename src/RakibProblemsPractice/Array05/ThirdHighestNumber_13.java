package RakibProblemsPractice.Array05;

import java.util.Arrays;
import java.util.Scanner;

/*
     Objective:
     The objective of the code is to find:
     1. the third-highest number in an array of integers provided by the user.
     2. The code takes the length of the array as input,
     3. allows the user to input the array elements,
     4. sorts the array,
     5. then determines the third-highest number along with other statistics such as the minimum and maximum numbers.
 */
public class ThirdHighestNumber_13 {    // done
    // Take the input of array length.
    // Input elements from the user.
    // Sort the array and find the third-highest number.

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the length of the array
        System.out.println("Enter the length of the array : ");
        int lengthOfArray = sc.nextInt();

        // Print the length of the array provided by the user
        System.out.println("Print length of array given by user : " + lengthOfArray);

        // Initialize an array of integers with the specified length
        int[] numbers = new int[lengthOfArray];

        // Print the array before entering the elements
        System.out.println("Before enter the element: " + Arrays.toString(numbers));

        // Prompt the user to enter the array elements sequentially
        System.out.println("Enter the array elements sequentially: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Call the sortedArray method to sort the array and find the third-highest number
        sortedArray(numbers, lengthOfArray);
    }

    public static void sortedArray(int[] numbers, int lengthOfArray) {
        // Print the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sort the array
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("After sort, array is: " + Arrays.toString(numbers));

        // Print the minimum number (first element in the sorted array)
        System.out.println("Minimum number is: " + numbers[0]);

        // Print the minimum dynamic number
        System.out.println("Minimum dynamic number is: " + numbers[numbers.length - lengthOfArray]);

        // Print the second minimum dynamic number
        System.out.println("Second minimum dynamic number is: " + numbers[numbers.length - (lengthOfArray - 1)]);

        // Print the maximum number (last element in the sorted array)
        System.out.println("Maximum number is: " + numbers[numbers.length - 1]);

        // Print the second maximum number (second last element in the sorted array)
        System.out.println("Second maximum number is: " + numbers[numbers.length - 2]);

        // Print the third maximum number (third last element in the sorted array)
        System.out.println("Third maximum number is: " + numbers[numbers.length - 3]);
    }
}