package top_SDET_JAVA_Programs_Tushar_Desai_TCS;

public class TCS_04_Factorial_of_a_Number {
    public static void main(String[] args) {
        int num = 5, factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

}
