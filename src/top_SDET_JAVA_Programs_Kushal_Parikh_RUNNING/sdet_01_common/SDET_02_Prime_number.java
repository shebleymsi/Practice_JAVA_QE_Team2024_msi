package top_SDET_JAVA_Programs_Kushal_Parikh_RUNNING.sdet_01_common;

import java.util.Scanner;

public class SDET_02_Prime_number {
    //Java program to find/check Prime number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number");

        } else {
            System.out.println(number + " is not a prime number");
        }

    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % 2 == 0) {
                return false;
            }
        }
        return false;
    }
}
