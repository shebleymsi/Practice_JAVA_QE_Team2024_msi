package zqe_w3school_2025.xw3_dsa00_Simple_Algorithm;

public class Fibonacci04First20FibonacciUseRecursion {

    public static void main(String[] args) {
        int n = 20;
        // Number of Fibonacci numbers to print
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
