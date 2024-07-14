package miscellanious_bazlor.ch_04;

import java.util.Scanner; // Import Scanner class to read input from the user

public class Pg_196_FindGreatestAndLowestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input
        System.out.print("Enter the number of integers you want to input: "); // Prompt user to enter the number of integers
        int n = input.nextInt(); // Read the number of integers

        if (n <= 0) { // Check if the number of integers is valid
            System.out.println("Please enter a valid number of integers."); // Print error message for invalid input
            return; // Exit the program if input is invalid
        }

        System.out.print("Enter integer number 1: "); // Prompt user to enter the first integer
        int number = input.nextInt(); // Read the first integer
        int greatest = number; // Initialize greatest with the first integer
        int lowest = number; // Initialize lowest with the first integer

        // Loop to read remaining integers
        // The loop starts at i = 2 because the first integer (when i = 1) has already been processed.
        //The loop then continues to read the remaining integers starting from the second one (i.e., i = 2).
        for (int i = 2; i <= n; i++) {
            System.out.print("Enter integer number " + i + ": "); // Prompt user to enter the next integer
            number = input.nextInt(); // Read the next integer

            if (number > greatest) { // Check if the current number is greater than the greatest number
                greatest = number; // Update greatest
            }

            if (number < lowest) { // Check if the current number is less than the lowest number
                lowest = number; // Update lowest
            }
        }

        System.out.println("Greatest number: " + greatest); // Print the greatest number
        System.out.println("Lowest number: " + lowest); // Print the lowest number
    }
}
