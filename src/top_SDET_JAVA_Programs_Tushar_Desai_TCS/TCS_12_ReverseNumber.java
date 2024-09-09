package top_SDET_JAVA_Programs_Tushar_Desai_TCS;

public class TCS_12_ReverseNumber {
    public static void main(String[] args) {
        int num = 12345, reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println(reversed);
    }

}
