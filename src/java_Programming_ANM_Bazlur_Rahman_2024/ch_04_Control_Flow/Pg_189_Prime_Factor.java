package java_Programming_ANM_Bazlur_Rahman_2024.ch_04_Control_Flow;

import java.util.Scanner;

public class Pg_189_Prime_Factor { // NEXT == (মৌলিক উত্পাদক)
    //The objective of the code is to find and print the prime factors of a given number.
    //Prime factors are the prime numbers that divide a given number exactly, without leaving a remainder.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        long n = input.nextLong();

        System.out.print("Prime factors of " + n + " are: ");

        for (long i = 2; i < n / i; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if (n > 1) {
            System.out.println(n);
        }
    }
}

