package top_SDET_JAVA_Programs_Kushal_Parikh_running.sdet_01_common;

import java.util.Scanner;

public class SDET_03_Fibonacci {
    // to find fibonacci series up to a given number range
    // out put: 0 1 1 2 3 5 8
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int number = sc.nextInt(); //int number = 6;
        int first = 0, second = 1, next;
        System.out.print("Fibonacci series is: ");
        for (int i = 0; i <= number; i++) {
            System.out.print(first + " ");
            next = second + first;
            first = second;
            second = next;
        }

    }
}
