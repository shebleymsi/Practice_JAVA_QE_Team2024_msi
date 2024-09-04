package top_SDET_JAVA_Programs_Kushal_Parikh_CODE_FULL.sdet_01_common;

public class SDET_08_01_DigitCounter_positive_number_msi {
    // Find the number of digits in the given number
    public static void main(String[] args) {
        int digitCount = 0;
        int inputNumber = 2024;
        while (inputNumber > 0) {
            inputNumber = inputNumber / 10;
            digitCount++;
        }

        System.out.println("Number of digits: " + digitCount);
    }
}
