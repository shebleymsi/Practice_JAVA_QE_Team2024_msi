package learnJavaQEWinter2022.RakibProblemsPractice.Array05;

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
        // Create an instance of the Random class
        Random rand = new Random();

        // Declare and initialize an array of integers with size 10
        int[] arr = new int[10];

        // Loop to populate the array with random integers between 0 and 99
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        // Print the array before sorting
        System.out.println(Arrays.toString(arr));

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Print the array after sorting
        System.out.println(Arrays.toString(arr));
    }
}