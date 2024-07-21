package midTermPractice.mathproblems_03;

public class Math_01_01_Factorial_by_Iteration {
    /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     */
    // here, using Iteration
    public static void main(String[] args) {
        Math_01_01_Factorial_by_Iteration factorial_by_Iteration = new Math_01_01_Factorial_by_Iteration();
        int number = 5; // Example number
        int result = factorial_by_Iteration.getFactorial(number); // Call the getFactorial method to calculate the factorial of the number
        System.out.println("Factorial of " + number + " (using iteration) is: " + result); // Print the result
    }

    // Method to calculate factorial using iteration
    public int getFactorial(int n) {
        int factorial = 1; // Initialize the factorial result to 1
        for (int i = 1; i <= n; i++) { // Iterate from 1 to n
            factorial = factorial * i; // Multiply the current number to the factorial result
        }
        return factorial; // Return the calculated factorial
    }
}
