package rakibProblems.array06;

import java.util.Arrays;

public class ArrayConcatenation {
        public static void main(String[] args) {
            String[] array1 = {"apple", "banana", "cherry"};
            String[] array2 = {"date", "elderberry"};

            // Creating a new array to hold the concatenated elements
            String[] concatenatedArray = new String[array1.length + array2.length];

            // Copying elements from array1 and array2 to concatenatedArray
            System.arraycopy(array1, 0, concatenatedArray, 0, array1.length);
            System.arraycopy(array2, 0, concatenatedArray, array1.length, array2.length);

            System.out.println("Concatenated array: " + Arrays.toString(concatenatedArray));
        }
    }

