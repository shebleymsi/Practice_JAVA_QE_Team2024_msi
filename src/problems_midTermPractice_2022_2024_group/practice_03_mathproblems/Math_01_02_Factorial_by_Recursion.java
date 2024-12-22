package problems_midTermPractice_2022_2024_group.practice_03_mathproblems;

public class Math_01_02_Factorial_by_Recursion {
    /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     */
    // here, using Recursion
    public static void main(String[] args) {
        Math_01_02_Factorial_by_Recursion factorial_by_Iteration = new Math_01_02_Factorial_by_Recursion();
        int number = 5; // Example number
        int result = factorial_by_Iteration.getFactorial(number); // Call the getFactorial method to calculate the factorial of the number
        System.out.println("Factorial of " + number + " (using recursion) is: " + result);
    }

    public int getFactorial(int n) {
       int resultCalculation;

        if (n == 1) {
            return 1;
        } else {
            resultCalculation = n * getFactorial(n - 1);
            return resultCalculation;
        }
    }
}
