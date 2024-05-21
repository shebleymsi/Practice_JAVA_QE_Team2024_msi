package learnJavaQEWinter2022.RakibProblems.Loop04;

public class SumNumbersByWhile05 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("Sum of numbers from 1 to 100: " + sum);
    }
}
