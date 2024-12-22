package problems_midTermPractice_2022_2024_group.practice_03_mathproblems;

import java.util.Scanner;

public class Math_03_05_PrimeNumber_interval_Series_do_while {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, count = 0, totalPrime = 0;

        // Input validation for initial integer
        do {
            System.out.print("Enter initial integer positive number (>= 2): ");
            m = input.nextInt();
            if (m < 2) {
                System.out.println("Please enter a number greater than or equal to 2.");
            }
        } while (m < 2);

        // Input validation for final integer
        do {
            System.out.print("Enter final integer positive number (>= 2): ");
            n = input.nextInt();
            if (n < 2) {
                System.out.println("Please enter a number greater than or equal to 2.");
            }
        } while (n < 2);

        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count = count + 1; //count++;
                    break;
                }

            }
            if (count == 0) {
                System.out.println(i);
                totalPrime = totalPrime + 1; //totalPrime++;
            }
            count = 0;
        }
        System.out.println("Total Prime Number = " + totalPrime);
    }

}