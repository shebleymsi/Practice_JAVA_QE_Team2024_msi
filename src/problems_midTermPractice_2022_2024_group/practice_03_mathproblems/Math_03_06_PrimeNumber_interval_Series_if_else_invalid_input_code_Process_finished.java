package problems_midTermPractice_2022_2024_group.practice_03_mathproblems;

import java.util.Scanner;

public class Math_03_06_PrimeNumber_interval_Series_if_else_invalid_input_code_Process_finished {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, count = 0, totalPrime = 0;

        // Input validation for initial integer using if-else
        System.out.print("Enter initial integer positive number (>= 2): ");
        m = input.nextInt();
        if (m < 2) {
            System.out.println("Invalid input. Please enter a number greater than or equal to 2.");
            return;
        }

        // Input validation for final integer using if-else
        System.out.print("Enter final integer positive number (>= 2): ");
        n = input.nextInt();
        if (n < 2) {
            System.out.println("Invalid input. Please enter a number greater than or equal to 2.");
            return;
        }

        // Finding prime numbers in the range
        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count = count + 1; //count++;
                    break;
                }
            }
            if (count == 0 && i > 1) {
                System.out.println(i);
                totalPrime = totalPrime + 1; //totalPrime++;
            }
            count = 0;
        }
        System.out.println("Total Prime Number = " + totalPrime);
    }
}
