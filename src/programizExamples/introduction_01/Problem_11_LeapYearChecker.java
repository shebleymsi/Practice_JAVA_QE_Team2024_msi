package programizExamples.introduction_01;

import java.util.Scanner;

public class Problem_11_LeapYearChecker {
    // Objective:
    // The objective of the above code is to determine whether a given year is a leap year or not.

    // A leap year is defined by the following rules:
    // A year is a leap year if it is divisible by 4.
    // However, if the year is also divisible by 100, it is not a leap year.
    // Nevertheless, if the year is also divisible by 400, it is a leap year.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt(); // Read the year input by the user

        // Variable to store whether the year is a leap year or not
        boolean isLeapYear;

        // Check if the year is divisible by 4
        if (year % 4 == 0) {
            // If the year is divisible by 100, check further
            if (year % 100 == 0) {
                // If the year is also divisible by 400, it is a leap year
                if (year % 400 == 0) {
                    isLeapYear = true; // Year is divisible by 400
                } else {
                    isLeapYear = false; // Year is divisible by 100 but not by 400
                }
            } else {
                isLeapYear = true; // Year is divisible by 4 but not by 100
            }
        } else {
            isLeapYear = false; // Year is not divisible by 4
        }

        // Output the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year."); // If true, print it is a leap year
        } else {
            System.out.println(year + " is not a leap year."); // If false, print it is not a leap year
        }
    }
}
