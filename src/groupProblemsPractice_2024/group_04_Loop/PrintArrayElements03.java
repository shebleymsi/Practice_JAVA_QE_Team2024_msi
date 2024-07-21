package groupProblemsPractice_2024.group_04_Loop;

import java.util.Arrays;

public class PrintArrayElements03 { //done

    public static void main(String[] args) {

        // Declare an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // 01. Print the elements of the array use for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }

        // 02. print by for each loop
        System.out.println(); // Adding a new line for better readability of output

        for (int number : numbers) {
            System.out.print(number + "\t");
        }

        // 03. print by while loop
        System.out.println(); // Adding a new line for better readability of output

        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + "\t");
            i++;
        }

        // 04. print by Arrays.toString()
        System.out.println(); // Adding a new line for better readability of output

        System.out.println(Arrays.toString(numbers));
    }
}
