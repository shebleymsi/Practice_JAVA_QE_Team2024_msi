package zqe_w3school_2025.xw3_dsa00_Simple_Algorithm;

public class Fibonacci02UseRecursion {
    static int count = 2;

    public static void fibonacci(int prev1, int prev2) {
        if (count <= 19) {
            int newFibo = prev1 + prev2;
            System.out.println(newFibo);
            prev2 = prev1;
            prev1 = newFibo;
            count += 1;
            fibonacci(prev1, prev2);
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        fibonacci(1, 0);
    }
}
// How can you generate and print the first 20 numbers in the Fibonacci sequence using recursion in a Java program?