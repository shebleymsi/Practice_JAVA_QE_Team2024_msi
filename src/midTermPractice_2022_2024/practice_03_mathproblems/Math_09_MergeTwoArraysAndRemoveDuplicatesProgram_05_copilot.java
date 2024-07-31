package midTermPractice_2022_2024.practice_03_mathproblems;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Math_09_MergeTwoArraysAndRemoveDuplicatesProgram_05_copilot {

    public static void main(String[] args) {
        int[] arr1 = { 3, 2, 1, 4, 5, 6, 8, 7, 6, 9 };
        int[] arr2 = { 8, 9, 10, 11, 12, 13, 15, 14, 15, 14, 16, 17 };

        Integer[] resultArray = mergeAndRemoveDuplicates(arr1, arr2);

        // Print the result
        System.out.println("Merged array without duplicates: " + Arrays.toString(resultArray));
    }

    public static Integer[] mergeAndRemoveDuplicates(int[] arr1, int[] arr2) {
        // Merge the two arrays
        int[] mergedArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

        // Eliminate duplicates using a LinkedHashSet
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : mergedArray) {
            set.add(num);
        }

        // Convert the set - back to an array
        return set.toArray(new Integer[0]);
    }
}






