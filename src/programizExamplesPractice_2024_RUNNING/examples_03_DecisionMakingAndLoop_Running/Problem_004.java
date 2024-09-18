package programizExamplesPractice_2024_RUNNING.examples_03_DecisionMakingAndLoop_Running;

public class Problem_004 {
    public static void main(String[] args) {
        int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; ++i) {
            factorial = factorial * i; //factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }

}
