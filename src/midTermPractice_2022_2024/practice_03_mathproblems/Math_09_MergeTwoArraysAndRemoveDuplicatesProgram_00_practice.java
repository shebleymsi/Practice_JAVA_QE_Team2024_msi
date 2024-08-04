package midTermPractice_2022_2024.practice_03_mathproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Math_09_MergeTwoArraysAndRemoveDuplicatesProgram_00_practice {

    // Note: Msi
    // array[index++] will give you the value at index, and then increment index.
    // array[++index] will first add 1 to the variable index, and then gives you the value;

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30));
        // OR,
        // Set<Integer> set1 = Set.of(40, 50, 60);

        // Convert the set to an array
        int[] covertArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            covertArray[index] = num;
            index = index + 1;
        }
        System.out.println(Arrays.toString(covertArray));

    }
}






