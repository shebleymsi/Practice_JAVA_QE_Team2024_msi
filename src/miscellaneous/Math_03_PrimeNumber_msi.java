package miscellaneous;

import java.util.Scanner;

public class Math_03_PrimeNumber_msi { // (মৌলিক সংখ্যা)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int n = input.nextInt();
        printPrime(n);
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0) return false;
        return true;
    }
    // Function to print primes
    static int printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
        return n;
    }

}
