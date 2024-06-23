package learnJavaQEWinter2022.problemsAndSolutionsPractice;

import java.util.Scanner;

public class CheckSumOfNumbers { // done

    // Main method where execution starts
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number : ");

        // Read the number entered by the user
        int number = input.nextInt();

        // Call the methods to calculate sums and print the results
        System.out.println("Total summation (0 to number): " + getTheSumOfNumbers(number));
        System.out.println("Total summation of even numbers (0 to number): " + getTheSumOfEvenNumbers(number));
        System.out.println("Total summation of odd numbers (1 to number): " + getTheSumOfOddNumbers(number));
    }

    // Method to sum all numbers from 0 to the given number
    public static int getTheSumOfNumbers(int number) {
        int total = 0;
        for (int i = 0; i <= number; i++) { // Increment by 1
            total = total + i;
            System.out.println(i + " => \t\t" + total); // Print each step
        }
        return total;
    }

    // Method to sum all even numbers from 0 to the given number
    public static int getTheSumOfEvenNumbers(int number) {
        int total = 0;

        for (int i = 0; i <= number; i += 2) { // Increment by 2
            total = total + i;
            System.out.println(i + " => \t\t" + total); // Print each step
        }
        return total;
    }

    // Method to sum all odd numbers from 1 to the given number
    public static int getTheSumOfOddNumbers(int number) {
        int total = 0;
        for (int i = 1; i <= number; i += 2) { // Increment by 2, starting from 1
            total = total + i;
            System.out.println(i + " => \t\t" + total); // Print each step
        }
        return total;
    }
}
