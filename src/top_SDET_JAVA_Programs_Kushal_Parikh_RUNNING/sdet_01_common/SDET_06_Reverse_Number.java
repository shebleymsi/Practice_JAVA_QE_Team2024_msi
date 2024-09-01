package top_SDET_JAVA_Programs_Kushal_Parikh_RUNNING.sdet_01_common;

public class SDET_06_Reverse_Number {
    //Reverse_Number
    public static void main(String[] args) {
        int number = 456;
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;  // This operation is often used to extract the last digit of a number.
            reversed = (reversed * 10) + digit;  // Append it to the reversed number
            number = number / 10;  // Remove the last digit
        }
        System.out.println("Reversed number: " + reversed);
    }
}
