package problems_midTermPractice_2022_2024_group.practice_03_mathproblems;

public class Math_02_Fibonacci_Series_Number_Recursion {
    /*
    Write a JAVA program to find series of Fibonacci numbers up to 10 using Recursion with java.
    */
    public static void main(String[] args) {

        int numberUpTo = 10;
        System.out.print("Fibonacci series up to " + numberUpTo + " numbers: ");

        for (int i = 0; i < numberUpTo; i++) {
            System.out.print(Math_02_Fibonacci_Series_Number_Recursion.getFibonacci(i) + ", ");
        }
    }

    public static int getFibonacci(int n) {
        int fibonacciCalculation;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            fibonacciCalculation = getFibonacci(n - 1) + getFibonacci(n - 2);
            return fibonacciCalculation;
        }
    }
}
