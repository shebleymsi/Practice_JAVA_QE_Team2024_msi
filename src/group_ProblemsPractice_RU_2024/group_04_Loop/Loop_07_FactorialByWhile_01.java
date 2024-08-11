package group_ProblemsPractice_RU_2024.group_04_Loop;

public class Loop_07_FactorialByWhile_01 { // done


    public static void main(String[] args) {
        getFactorialByForLoop();
        getFactorialByWhileLoop();
    }

    public static void getFactorialByForLoop() {
        int n = 4;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;  // factorial = factorial * i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    public static void getFactorialByWhileLoop() {
        int n = 4;
        int factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i; // factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);

    }
}
