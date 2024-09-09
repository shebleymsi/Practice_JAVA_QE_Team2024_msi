package top_SDET_JAVA_Programs_Tushar_Desai_TCS;

public class TCS_24_SumOfDigits {
    //24. Find the Sum of Digits of a Number
    public static void main(String[] args) {
        int num = 12345, sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }

}
