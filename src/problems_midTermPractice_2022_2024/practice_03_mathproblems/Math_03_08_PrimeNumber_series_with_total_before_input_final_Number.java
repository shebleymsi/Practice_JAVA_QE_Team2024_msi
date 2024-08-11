package problems_midTermPractice_2022_2024.practice_03_mathproblems;

import java.util.Scanner;

public class Math_03_08_PrimeNumber_series_with_total_before_input_final_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, count, m = 2;
        int totalPrime = 0;

        // Input validation for the final number
        System.out.print("Enter a number greater than or equal to 2: ");
        n = input.nextInt();
        while (n < 2) {
            System.out.println("Please enter a number greater than or equal to 2.");
            System.out.print("Enter a number greater than or equal to 2: ");
            n = input.nextInt();
        }

        // Finding prime numbers in the range
        for (int i = m; i <= n; i++) { // Note the change: i <= n to include n itself
            count = 0;
            for (int j = 2; j <= i / 2; j++) { // Optimization: check divisors up to i / 2
                if (i % j == 0) {
                    count = count + 1;
                    break;
                }
            }
            if (count == 0 && i > 1) { // Condition for prime numbers
                System.out.println(i);
                totalPrime = totalPrime + 1; //totalPrime++;
            }
        }
        System.out.println("Total Prime Numbers = " + totalPrime);
    }
}
