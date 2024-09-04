package top_SDET_JAVA_Programs_Tushar_Desai_TCS_SMART_CODE;

public class TCS_22_PerfectNumber {
    //22. Check for Perfect Number
    public static void main(String[] args) {  int num = 28, sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        System.out.println(num == sum);
    }

}
