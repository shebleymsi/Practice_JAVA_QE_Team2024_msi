package Java_Programming_ANM_Bazlur_Rahman.ch_04_Control_Flow;

import java.util.Scanner; // Import Scanner class to read input from the user

public class Pg_196_FindGreatestAndLowestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers you want to input: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid number of integers.");
            return;
        }

        System.out.print("Enter integer number 1: ");
        int number = input.nextInt();
        int greatest = number;
        int lowest = number; // Initialize lowest with the first integer

        // Loop to read remaining integers
        // The loop starts at i = 2 because the first integer (when i = 1) has already been processed.
        //The loop then continues to read the remaining integers starting from the second one (i.e., i = 2).
        for (int i = 2; i <= n; i++) {
            System.out.print("Enter integer number " + i + ": ");
            number = input.nextInt();

            if (number > greatest) { // Check if the current number is greater than the greatest number
                greatest = number; // Update greatest
            }

            if (number < lowest) { // Check if the current number is less than the lowest number
                lowest = number; // Update lowest
            }
        }

        System.out.println("Greatest number: " + greatest);
        System.out.println("Lowest number: " + lowest);
    }
}
