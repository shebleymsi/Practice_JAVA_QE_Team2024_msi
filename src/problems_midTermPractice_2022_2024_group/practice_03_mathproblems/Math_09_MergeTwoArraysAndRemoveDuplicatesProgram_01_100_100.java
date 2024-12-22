package problems_midTermPractice_2022_2024_group.practice_03_mathproblems;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Math_09_MergeTwoArraysAndRemoveDuplicatesProgram_01_100_100 {
    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}

    // Note: Msi
    // array[++index] will first add 1 to the variable index, and then gives you the value;
    // array[index++] will give you the value at index, and then increment index.

    public static void main(String[] args) {
        int[] array1 = {0, 1, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8, 9, 10};

        int[] mergedArray = mergeAndRemoveDuplicates(array1, array2);
        System.out.println("Merged array without duplicates: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeAndRemoveDuplicates(int[] array1, int[] array2) {
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

        return mergedArray;
    }
}






