package rakibProblemsPractice.array05;

import java.util.Arrays;

public class ArrayReversal_15 {


        public static void main(String[] args) {
            String[] array = {"apple", "banana", "cherry", "date", "elderberry"};

            // Reversing the array
            for (int i = 0; i < array.length / 2; i++) {
                String temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }

            System.out.println("Reversed array: " + Arrays.toString(array));
        }
    }

