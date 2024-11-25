package java_Programming_ANM_Bazlur_Rahman_2024__RUNNING.porisisto_8_Recursion;

public class Pg_708_FactorialGenerator_loop {
    public int getFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Pg_708_FactorialGenerator_loop factorialGenerator = new Pg_708_FactorialGenerator_loop();
        int x = factorialGenerator.getFactorial(6);
        System.out.println(x);
    }
}
// this is not recursion example