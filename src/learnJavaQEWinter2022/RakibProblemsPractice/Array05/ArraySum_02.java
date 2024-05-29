package learnJavaQEWinter2022.RakibProblemsPractice.Array05;

public class ArraySum_02 { // done
    public static void main(String[] args) {
        getSum(); // use for loop
        getSum1(); // use for-each loop
    }

    public static void getSum() {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        // Using a regular for loop to calculate the sum of array elements
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Sum of array elements use for loop: " + sum);
    }


    public static void getSum1() {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        // Using a regular for-each loop to calculate the sum of array elements
        for (int num : array) {
            sum += num; // sum = sum + num
        }

        System.out.println("Sum of array elements use for-each loop: " + sum);
    }


}

