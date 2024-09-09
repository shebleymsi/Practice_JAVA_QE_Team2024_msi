package java_Programming_ANM_Bazlur_Rahman_2024__RUNNING.ch_05_Array;

import java.util.Scanner;

public class Pg_204_Array_Scanner_Length_and_element_Sum_Avg_Min_Max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the console
        System.out.print("Length of array: "); // Prompt the user to enter the length of the array
        int sizeOfArray = input.nextInt(); // Read the length of the array from the console

        int[] numbers = new int[sizeOfArray]; // Create an array of integers with the specified length
        for (int i = 0; i < numbers.length; i++) { // Loop through the array to fill it with user input
            System.out.print(i + ":\t\t"); // Prompt the user to enter a value for each index
            numbers[i] = input.nextInt(); // Read the value from the console and store it in the array
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        double average = (double) sum / numbers.length;
        int min = numbers[0]; // Initialize minimum with the first index
        int max = numbers[0]; // Initialize maximum with the first index

        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        System.out.println(sum);
        System.out.println(average);
        System.out.println(min);
        System.out.println(max);


    }

//    Important Note:
//    i <= numbers.length-1;
//      or,
//    i < numbers.length;

}
