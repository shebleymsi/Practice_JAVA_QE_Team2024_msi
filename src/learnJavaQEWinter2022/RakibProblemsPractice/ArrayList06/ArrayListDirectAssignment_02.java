package learnJavaQEWinter2022.RakibProblemsPractice.ArrayList06;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListDirectAssignment_02 {
    /*
    Objective:
    The objective of the code is to demonstrate,
    how to directly assign ---- a list of integers to an ArrayList ---- using the Arrays.asList() method in Java.
    This method provides a convenient way to initialize an ArrayList with a predefined set of elements.
    */
    public static void main(String[] args) {
        // Creating an ArrayList and initializing it with values using Arrays.asList()
        ArrayList<Integer> myInt2 = new ArrayList<>(Arrays.asList(25, 26, 27, 28, 29, 30, 31, 32, 33));

        // Printing the ArrayList to the console
        System.out.println(myInt2);
    }
}