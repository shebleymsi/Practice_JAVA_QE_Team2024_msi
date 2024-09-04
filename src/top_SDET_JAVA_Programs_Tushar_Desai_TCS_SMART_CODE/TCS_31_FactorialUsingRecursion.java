package top_SDET_JAVA_Programs_Tushar_Desai_TCS_SMART_CODE;

public class TCS_31_FactorialUsingRecursion {
    //31. Find the Factorial of a Number using Recursion
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
    }
    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

}
