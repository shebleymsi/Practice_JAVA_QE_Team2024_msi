package top_SDET_JAVA_Programs_Kushal_Parikh.sdet_01_common;

public class SDET_05_Factorial {
    //Find Factorial on given Number
    public static void main(String[] args) {
        int factorial = 1;
        int number = 5;
        for (int i = 1; i < number; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
