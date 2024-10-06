package top_SDET_JAVA_Programs_Kushal_Parikh_IMPORTANT.sdet_01_common;

public class SDET_07_Armstrong_Number_NEXT {
    // Java program to find Armstrong Number
    // An Armstrong number (also known as a narcissistic number)
    // is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
    // Example: 1^3 + 5^3 + 3^3 = 153.
    public static void main(String[] args) {
        int number = 153; // Replace this with the number you want to check
        int originalNumber = number;
        int armstrongSum = 0;
        int digit;

        // Calculate the sum of the cubes of the digits
        while (number != 0) {
            digit = number % 10;
            number = number / 10;
            armstrongSum = armstrongSum + digit * digit * digit;
        }

        // Check if the original number is equal to the armstrongSum
        if (armstrongSum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}