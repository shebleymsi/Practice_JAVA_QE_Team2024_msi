package midTermPractice_2022_2024.practice_03_mathproblems;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Math_09_MergeTwoArraysAndRemoveDuplicatesProgram_02 {
    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}
    public static void main(String[] args) {
        int[] arrayA = {1, 3, 4, 5};
        int[] arrayB = {4, 5, 6, 7, 8, 9, 10};
        int[] mergedArray = mergeAndRemoveDuplicates(arrayA, arrayB);
        System.out.println("Merged array without duplicates: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeAndRemoveDuplicates(int[] arrayA, int[] arrayB) {
        // Use a TreeSet to store the elements in sorted order and remove duplicates
        Set<Integer> set = new TreeSet<>();
        // Add elements from both arrays to the set
        for (int num : arrayA) {
            set.add(num);
        }
        for (int num : arrayB) {
            set.add(num);
        }
        System.out.println(set);


        // Convert the set : back to an array
        // Convert the set back to an array using toArray()
        Integer[] integerArray = set.toArray(new Integer[0]); // Create an Integer array
        int[] mergedArray = new int[integerArray.length]; // Create an int array of the same length

        // Copy Integer values to the int array
        for (int i = 0; i < integerArray.length; i++) {
            mergedArray[i] = integerArray[i]; // Unbox the Integer to int
        }


        return mergedArray;
    }
}






