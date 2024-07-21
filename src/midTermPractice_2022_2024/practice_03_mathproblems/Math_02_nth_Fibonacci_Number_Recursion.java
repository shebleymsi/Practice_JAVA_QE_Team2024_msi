package midTermPractice_2022_2024.practice_03_mathproblems;

public class Math_02_nth_Fibonacci_Number_Recursion {
    /*
    Write a JAVA program to find nth Fibonacci numbers with java.
    */

    public static void main(String[] args) {
        Math_02_nth_Fibonacci_Number_Recursion nthFibonacciNumber = new Math_02_nth_Fibonacci_Number_Recursion();
        int nthNumber = 10;
        int fibonacci = nthFibonacciNumber.getFibonacci(nthNumber);
        System.out.println("Fibonacci of " + nthNumber + "th (using recursion) is: " + fibonacci);
    }

    public int getFibonacci(int n) {
        int fibonacciCalculation;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        fibonacciCalculation = getFibonacci(n - 1) + getFibonacci(n - 2);
        return fibonacciCalculation;
    }

}