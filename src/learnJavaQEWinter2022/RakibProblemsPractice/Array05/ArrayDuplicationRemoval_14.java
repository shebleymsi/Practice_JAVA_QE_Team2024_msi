package learnJavaQEWinter2022.RakibProblemsPractice.Array05;

import java.util.Arrays;

public class ArrayDuplicationRemoval_14 {

        public static void main(String[] args) {
            int[] array = {10, 20, 10, 30, 40, 20};

            // Using a temporary array to remove duplicates
            int[] uniqueArray = Arrays.stream(array).distinct().toArray();

            System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
        }
    }

