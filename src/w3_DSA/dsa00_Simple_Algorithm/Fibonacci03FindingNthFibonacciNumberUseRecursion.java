package w3_DSA.dsa00_Simple_Algorithm;

public class Fibonacci03FindingNthFibonacciNumberUseRecursion {

    public static void main(String[] args) {
        System.out.println(F(19));
    }

    public static int F(int n) {
        if (n <= 1) {
            return n;
        } else {
            return F(n - 1) + F(n - 2);
        }
    }

}
//Finding The nth Fibonacci Number Using Recursion