package top_SDET_JAVA_Programs_Kushal_Parikh_IMPORTANT.sdet_01_common;

public class SDET_08_02_DigitCounter_positive_number_msi {
    // Find the number of digits in the given number
    public static void main(String[] args) {

        int inputNumber = 2024;
        int digitCount = 0;
        for (; inputNumber > 0;  digitCount++) {
            inputNumber = inputNumber / 10;
        }
        System.out.println("Number of digits: " + digitCount);
    }
}
