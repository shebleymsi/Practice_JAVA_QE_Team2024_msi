package problems_midTermPractice_2022_2024_group.practice_03_mathproblems;

import java.util.Arrays;
import java.util.HashSet;

public class Math_09_MergeTwoArraysAndRemoveDuplicatesProgram_02_100_100 {

    public static void main(String[] args) {
        // Example arrays
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {4, 5, 6, 7, 8, 9, 10};
        // Merging arrays and removing duplicates
        Integer[] mergedArray = mergeAndRemoveDuplicates(array1, array2);
        // Printing the result
        System.out.println("Merged array without duplicates: " + Arrays.toString(mergedArray));
    }

    public static Integer[] mergeAndRemoveDuplicates(Integer[] array1, Integer[] array2) {
        HashSet<Integer> set = new HashSet<>();
        // Add elements from the first array
        for (Integer num : array1) {
            set.add(num);
        }
        // Add elements from the second array
        for (Integer num : array2) {
            set.add(num);
        }
        System.out.println(set); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        // Convert the set-back to an array
        Integer[] newArray = set.toArray(new Integer[0]);
        return newArray;
    }
}






