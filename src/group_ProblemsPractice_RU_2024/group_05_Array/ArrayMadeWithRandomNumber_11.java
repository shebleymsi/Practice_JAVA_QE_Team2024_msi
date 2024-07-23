package group_ProblemsPractice_RU_2024.group_05_Array;

import java.util.Arrays;
import java.util.Random;

public class ArrayMadeWithRandomNumber_11 { //done
    /*
    Objective of the Code:
    The objective of this code is to create an array of random integers,
    print the array before and after sorting it.
    The program uses Java's Random class to generate random numbers
    and the Arrays class to print and sort the array.
     */

    public static void main(String[] args) {

        //================Step:01 --> create random array ===============================

        // Create an instance of the Random class
        Random rand = new Random();

        // Declare and initialize an array of integers with size 10
        int[] arr = new int[10];
        System.out.println("before input element in Array: \n" + Arrays.toString(arr));

        // Loop to populate the array with (input) random integers between 0 and 99 --> [100]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100); // main statement
        }

        // Print the array before sorting
        System.out.println(Arrays.toString(arr));

        //================Step:02 --> created random array sorting ===============================
        // Sort the array in ascending order
        Arrays.sort(arr);

        // Print the array after sorting
        System.out.println(Arrays.toString(arr));
    }
}