package java_Programming_ANM_Bazlur_Rahman_2024.ch_05_Array;

import java.util.Scanner;

public class Pg_203_Array_Scanner_Length_and_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the console
        System.out.print("Length of array: "); // Prompt the user to enter the length of the array
        int sizeOfArray = input.nextInt(); // Read the length of the array from the console

        int[] numbers = new int[sizeOfArray]; // Create an array of integers with the specified length

        for (int i = 0; i < numbers.length; i++) { // Loop through the array to fill it with user input
            System.out.print(i + ":\t\t"); // Prompt the user to enter a value for each index
            numbers[i] = input.nextInt(); // Read the value from the console and store it in the array
        }

        System.out.println("Index \t Value"); // Print the table header for index and value

        for (int i = 0; i < numbers.length; i++) { // Loop through the array to print each index and its corresponding value
            System.out.println(i + "\t\t" + numbers[i]); // Print the index and the value at that index
        }
    }
}
