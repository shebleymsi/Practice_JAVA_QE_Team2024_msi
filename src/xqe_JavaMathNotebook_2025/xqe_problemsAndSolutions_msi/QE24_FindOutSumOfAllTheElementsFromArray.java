package xqe_JavaMathNotebook_2025.xqe_problemsAndSolutions_msi;

import java.util.Arrays;
import java.util.Scanner;

public class QE24_FindOutSumOfAllTheElementsFromArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int length = scanner.nextInt();
        int[] numbers = new int[length];

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

