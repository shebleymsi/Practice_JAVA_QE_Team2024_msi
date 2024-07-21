package groupProblemsPractice_2024.group_06_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithAraay_03_02 { // done

    /*
    Objective of the Code:
    1. Initialize Arrays: Initialize five integer arrays representing different classes.
    2. Create and Populate ArrayList: Create an ArrayList<int[]> called schools and populate it with the arrays.
    3. Print Method: The printArrayList method prints each array within the ArrayList using Arrays.toString()
    and encapsulates the entire output within square brackets.
    4. Output: The program outputs the contents of each array within the ArrayList,
    formatted like [[element1, element2, element3, ...], ...].
     */

    public static void main(String[] args) {
        // Initialize arrays for different classes
        int[] class1 = {11, 23, 44, 22, 55};
        int[] class2 = {10, 9, 30, 13, 20};
        int[] class3 = {10, 9, 30, 13, 20};
        int[] class4 = {10, 9, 30, 13, 20};
        int[] class5 = {10, 9, 30, 13, 20};

        // Create an ArrayList to store the arrays
        ArrayList<int[]> schools = new ArrayList<>();
        schools.add(class1);
        schools.add(class2);
        schools.add(class3);
        schools.add(class4);
        schools.add(class5);

        // Print the ArrayList of arrays
        printArrayList(schools);
    }

    // Method to print the ArrayList of arrays
    public static void printArrayList(ArrayList<int[]> arrayList) {
        // Iterate over each array in the ArrayList
        System.out.print("[");
        for (int i = 0; i < arrayList.size(); i++) { // i<5
            // Get the array at the current index
            int[] array = arrayList.get(i);
            // Print the array using Arrays.toString()
            System.out.print(Arrays.toString(array));
            // Add a comma between arrays, except after the last array
            if (i < arrayList.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }


}
