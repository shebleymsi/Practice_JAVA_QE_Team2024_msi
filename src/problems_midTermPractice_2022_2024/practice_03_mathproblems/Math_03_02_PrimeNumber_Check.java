package problems_midTermPractice_2022_2024.practice_03_mathproblems;

import java.util.Scanner;

public class Math_03_02_PrimeNumber_Check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, count = 0;
        System.out.print("Enter any positive integer : ");
        num = input.nextInt();
        input.close();

        if (num < 2) {
            System.out.println("Not Prime");
            return;
        }

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                count = count + 1; //count++;
                break;
            }
        }


        if (count == 0) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not Prime");
        }

    }
}
