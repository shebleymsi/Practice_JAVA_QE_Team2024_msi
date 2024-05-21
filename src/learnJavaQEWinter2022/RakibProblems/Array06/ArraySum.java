package learnJavaQEWinter2022.RakibProblems.Array06;

public class ArraySum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}

