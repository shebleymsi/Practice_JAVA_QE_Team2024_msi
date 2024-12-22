package problems_midTermPractice_2022_2024_group.practice_03_mathproblems;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Math_09_MergeTwoArraysAndRemoveDuplicatesProgram_00 {


    public static void main(String[] args) {
        int[] array1 = {0, 1, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8, 9, 10};

        // Use a TreeSet to store the elements in sorted order and remove duplicates
        Set<Integer> set = new TreeSet<>();

        // Add elements from both arrays to the set
        for (int num : array1) {
            set.add(num);
        }
        for (int num : array2) {
            set.add(num);
        }
        System.out.println(set); // [0, 1, 3, 4, 5, 6, 7, 8, 9, 10]

        // Convert the set --> back to an array ************
        int[] mergedArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            mergedArray[index] = num;
            index = index + 1;
        }
        System.out.println("Merged array without duplicates: " + Arrays.toString(mergedArray));

    }
}






