package learnJavaQEWinter2022.RakibProblemsPractice.Array05;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayWithScanner_01_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of elements you want in the array:");
        int numberOfElements = scanner.nextInt();

        int[] array = new int[numberOfElements];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("The array elements are:" + Arrays.toString(array));

        // Optional: Close the scanner
        scanner.close();
    }
}

