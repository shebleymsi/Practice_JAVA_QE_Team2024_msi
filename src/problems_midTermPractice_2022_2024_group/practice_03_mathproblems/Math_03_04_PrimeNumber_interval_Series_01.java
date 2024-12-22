package problems_midTermPractice_2022_2024_group.practice_03_mathproblems;

import java.util.Scanner;

public class Math_03_04_PrimeNumber_interval_Series_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        System.out.print("Enter initial integer positive number : ");
        m = input.nextInt();
        System.out.print("Enter final integer positive number : ");
        n = input.nextInt();
        input.close();

        int totalPrime = getPrimeSeries(m, n);
        System.out.println("Total Prime Number = " + totalPrime);
    }

    public static int getPrimeSeries(int m, int n) {
        int totalPrime = 0;

        // Adjust m and n if they are less than 2
        if (m < 2) {
            m = 2;
        }
        if (n < 2) {
            n = 2;
        }

        for (int i = m; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
                totalPrime++;
            }
        }

        return totalPrime;
    }
}
