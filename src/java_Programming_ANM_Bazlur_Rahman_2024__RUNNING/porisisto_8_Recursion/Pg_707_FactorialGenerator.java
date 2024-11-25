package java_Programming_ANM_Bazlur_Rahman_2024__RUNNING.porisisto_8_Recursion;

public class Pg_707_FactorialGenerator {
    public int getFactorial(int n) {
        if (n == 1) {
            return 1; //base case
        } else {
            return (n * (getFactorial(n - 1))); //recursive case
        }
    }

    public static void main(String[] args) {
        Pg_707_FactorialGenerator factorialGenerator = new Pg_707_FactorialGenerator();
        int x = factorialGenerator.getFactorial(6);
        System.out.println(x);
    }

}

// 4!=4×3×2×1
// 5!=5×4×3×2×1