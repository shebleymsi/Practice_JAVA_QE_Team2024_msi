package java_Programming_ANM_Bazlur_Rahman_2024__RUNNING.porisisto_8_Recursion;

public class Pg_706_Fibonacci {
    public int fib(int n) {

        //base case
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        //recursive case
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Pg_706_Fibonacci fibonacci = new Pg_706_Fibonacci();
        int x = fibonacci.fib(10);
        System.out.println(x);
    }
}

// Explantion: book
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
// f(𝑛)=f(𝑛−1)+f(𝑛−2)
