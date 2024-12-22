package problemsAndSolutionsPractice_2022_2024_group;

import java.util.Arrays;
import java.util.Scanner;

public class FindOutSumOfAllTheElementsFromArray_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Ask the user for the length of the array
        System.out.print("Enter the number of elements: ");
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        // Use a for loop to populate the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number, input" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(numbers));


        sumOfElements(numbers);

    }

    public static void sumOfElements(int[] numbers) {

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum = " + sum);

    }


}
