package RakibProblemsPractice.Array05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySumAverageMinMaxScanner_02post { //done
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the length of the array
        System.out.print("Length of the array: ");
        int sizeOfArray = input.nextInt();

        // Initialize the array with the given size
        int[] numbers = new int[sizeOfArray];

        // Loop to get the array elements from the user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = input.nextInt();
        }

        // Print the array elements
        System.out.println("Array elements: " + Arrays.toString(numbers));

        // Initialize variables to calculate sum, min, and max
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Loop through the array to calculate sum, min, and max
        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i]; // Add current element to sum

            if (numbers[i] < min) {
                min = numbers[i]; // Update min if current element is smaller
            }

            if (numbers[i] > max) {
                max = numbers[i]; // Update max if current element is larger
            }
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Print the results
        System.out.println("Summation: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}