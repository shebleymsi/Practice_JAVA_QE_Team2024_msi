package top_SDET_JAVA_Programs_Kushal_Parikh_RUNNING.sdet_01_common;

public class SDET_08_DigitCounter {
    // Find the number of digits in the given number
    public static void main(String[] args) {
        int digitCount = 0;
        int inputNumber = -2024; // Example with a negative number

        // Convert negative numbers to positive
        if (inputNumber < 0) {
            inputNumber = -inputNumber; // Convert negative number to positive
        }

        // Special case for zero
        if (inputNumber == 0) {
            digitCount = 1; // Zero has one digit
        } else {
            // Count digits for positive numbers
            while (inputNumber > 0) {
                inputNumber = inputNumber / 10;
                digitCount++;
            }
        }

        System.out.println("Number of digits: " + digitCount);
    }
}
