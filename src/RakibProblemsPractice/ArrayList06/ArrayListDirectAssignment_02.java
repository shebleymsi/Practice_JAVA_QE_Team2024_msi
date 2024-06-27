package RakibProblemsPractice.ArrayList06;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListDirectAssignment_02 {
    /*
    Objective:
    The objective of the code is to demonstrate,
    how to directly assign ---- a list of integers to an ArrayList ---- using the Arrays.asList() method in Java.
    This method provides a convenient way to initialize an ArrayList with a predefined set of elements.
    */
    // Convert --> Array to ArrayList
    // Creating an ArrayList and initializing it with values using Arrays.asList()
    // ArrayLIst initializing, same as example for array int[] myIntArray = {2,3,4,5,6};


    public static void main(String[] args) {

        //=======================================================================
        // Convert --> Array to ArrayList----------------> manual way
        Integer[] myIntArray1 = {2, 3, 4, 5, 6}; // Given Array
        ArrayList<Integer> myIntArrayList1 = new ArrayList<>(); // desire ArrayList

        // converting step
        for (int i = 0; i < myIntArray1.length; i++) {
            myIntArrayList1.add(myIntArray1[i]);

        }
        myIntArrayList1.set(0, 9); // replace 1st index
        System.out.println("==================\n" + myIntArrayList1);
        //=======================================================================

        // Creating an ArrayList and initializing it with values using Arrays.asList()
        // ArrayLIst initializing, same as example for array int[] myIntArray = {2,3,4,5,6};
        ArrayList<Integer> myInt2 = new ArrayList<>(Arrays.asList(25, 26, 27, 28, 29, 30, 31, 32, 33));
        // Printing the ArrayList to the console
        System.out.println(myInt2);

        //===============================   *********   ========================================
        // Convert --> Array to ArrayList-direct way using variable
        Integer[] myIntArray = {2, 3, 4, 5, 6}; // Array
        ArrayList<Integer> myInt3 = new ArrayList<>(Arrays.asList(myIntArray)); // ArrayList
        System.out.println("****************\n" + myInt3);


        // ========================= Original/old way to declare an Array ==========================
        Integer[] myInt4 = new Integer[]{25, 26, 27, 28, 29, 30, 31, 32, 33};
        Integer[] myInt5 = new Integer[]{25, 26, 27, 28, 29, 30, 31, 32, 33};
        String name = new String("Rakib");  // Original way to declare String
        // ========================= Original way to declare Array ==========================


    }
}