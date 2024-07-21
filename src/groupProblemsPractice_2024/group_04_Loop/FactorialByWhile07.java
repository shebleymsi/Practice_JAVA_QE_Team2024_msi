package groupProblemsPractice_2024.group_04_Loop;

public class FactorialByWhile07 {

    static int n = 5;
    static int factorial = 1;
    static int i = 1;

    public static void main(String[] args) {
        getFactorialByForLoop();
        getFactorialByWhileLoop();
    }

    public static void getFactorialByForLoop() {

        for (; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    public static void getFactorialByWhileLoop() {

        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);

    }
}
