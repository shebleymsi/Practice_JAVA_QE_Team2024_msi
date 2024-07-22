package midTermPractice_2022_2024.practice_03_mathproblems;

public class Math_02_Fibonacci_Series_Iteration_calling_method {

    public static void main(String[] args) {
        int count = 10; // Number of Fibonacci numbers to print
        printFibonacciSeries(count);
    }

    // Method to generate and print the Fibonacci series
    public static void printFibonacciSeries(int count) {
        int n1 = 0, n2 = 1, n3, i;
        System.out.print(n1 + ", " + n2); // Printing 0 and 1
        for (i = 2; i < count; i++) { // Loop starts from 2 because 0 and 1 are already printed
            n3 = n1 + n2;
            System.out.print(", " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
