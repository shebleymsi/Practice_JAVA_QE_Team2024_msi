package rakibProblems.array06;

import java.util.Arrays;

public class ArrayDuplicationRemoval {

        public static void main(String[] args) {
            int[] array = {10, 20, 10, 30, 40, 20};

            // Using a temporary array to remove duplicates
            int[] uniqueArray = Arrays.stream(array).distinct().toArray();

            System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
        }
    }

