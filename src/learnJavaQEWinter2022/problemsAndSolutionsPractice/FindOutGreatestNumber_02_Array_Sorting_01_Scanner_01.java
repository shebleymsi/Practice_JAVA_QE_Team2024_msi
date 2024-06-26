package learnJavaQEWinter2022.problemsAndSolutionsPractice;

import java.util.Arrays;
import java.util.Scanner;

public class FindOutGreatestNumber_02_Array_Sorting_01_Scanner_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        // Use a for loop to populate the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number, input" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        int largest = numbers[numbers.length - 1];
        System.out.println(largest + " is the largest number");
    }
}
