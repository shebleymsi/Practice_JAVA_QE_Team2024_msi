package learnJavaQEWinter2022.RakibProblemsPractice.Array05;

public class ArraySum_02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}

