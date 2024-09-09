package top_SDET_JAVA_Programs_Kushal_Parikh.sdet_01_common;

import java.util.Scanner;

public class SDET_09_Palindrome_Number {
    // Java program to find Palindrome number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number");
        }else {
            System.out.println(number + " is not a palindrome number");
        }
    }
    public static boolean isPalindrome(int number){
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0){
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number/10;
        }
        return originalNumber == reversedNumber;
    }
}
