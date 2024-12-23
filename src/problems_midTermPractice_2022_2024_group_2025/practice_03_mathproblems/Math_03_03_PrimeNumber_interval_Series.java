package problems_midTermPractice_2022_2024_group_2025.practice_03_mathproblems;

import java.util.Scanner;

public class Math_03_03_PrimeNumber_interval_Series {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        System.out.print("Enter initial integer positive number : ");
        m = input.nextInt();
        System.out.print("Enter final integer positive number : ");
        n = input.nextInt();
        input.close();

        getPrimeSeries(m, n);

    }

    // this code should be upgraded. but raw code love its,

    public static int getPrimeSeries(int m, int n) {

        int totalPrime = 0;


        if (n < 2) {
            System.out.println("invalid input");
            return 0;
        }

        if (m < 2) {
            m = 2;
        }

        int count = 0;

        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count = count + 1; // count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
                totalPrime = totalPrime + 1; // totalPrime++;
            }
            count = 0;
        }


        System.out.println("Total Prime Number = " + totalPrime);
        return 0;
    }
}
