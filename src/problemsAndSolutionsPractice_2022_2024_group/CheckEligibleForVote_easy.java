package problemsAndSolutionsPractice_2022_2024_group;

import java.util.Scanner;

public class CheckEligibleForVote_easy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Check if the user is eligible to vote
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Close the scanner
        input.close();
    }
}
