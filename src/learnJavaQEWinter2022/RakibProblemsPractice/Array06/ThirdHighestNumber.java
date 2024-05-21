package learnJavaQEWinter2022.RakibProblemsPractice.Array06;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdHighestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array");

        int lengthOfArray = sc.nextInt();

        int[] numbers = new int[lengthOfArray];

        System.out.println("enter the numbers");

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = sc.nextInt();
        }


        System.out.println("Original array: " + Arrays.toString(numbers));

        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);

        linearSort(numbers, min, max);

        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void linearSort(int[] array, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[array.length];

        // Count occurrences of each element
        for (int i = 0; i < array.length; i++) {
            count[array[i] - min]++;
        }

        // Place elements in correct position in output array
        int index = 0;
        for (int i = 0; i < range; i++) {
            for (int j = 0; j < count[i]; j++) {
                output[index++] = i + min;
            }
        }

        // Copy sorted elements back to original array
        System.arraycopy(output, 0, array, 0, array.length);
    }
}

