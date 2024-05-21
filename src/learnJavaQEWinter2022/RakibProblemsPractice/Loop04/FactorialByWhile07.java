package learnJavaQEWinter2022.RakibProblemsPractice.Loop04;

public class FactorialByWhile07 {

    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
