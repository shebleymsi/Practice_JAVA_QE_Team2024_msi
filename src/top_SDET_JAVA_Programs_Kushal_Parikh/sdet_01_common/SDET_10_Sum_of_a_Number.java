package top_SDET_JAVA_Programs_Kushal_Parikh.sdet_01_common;

public class SDET_10_Sum_of_a_Number {
    public static void main(String[] args) {
        int number = 12345;
        int sumOfDigits = calculateSumOfDigits(number);
        System.out.println("Sum of digits of "+ number + " is: " + sumOfDigits);
    }
    public static int calculateSumOfDigits(int number){
        int sum = 0;
        while (number > 0){
            int digit = number%10; // Extract the last digit
            sum = sum +digit;       // Add the digit to sum
            number = number/10; // Remove the last digit from number
        }
        return sum;
    }
}
