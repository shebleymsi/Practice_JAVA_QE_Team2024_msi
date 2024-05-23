package learnJavaQEWinter2022.RakibProblemsPractice.Array05;

import java.util.Arrays;

public class Practice_Qe_Winter2022_05 {

        public static void main(String[] args) {
            int[] array = {4, 2, 7, 1, 9, 3, 5};

            System.out.println("Original array: " + Arrays.toString(array));

            int min = findMin(array);
            int max = findMax(array);

            System.out.println("Minimum number: " + min);
            System.out.println("Maximum number: " + max);

            linearSort(array, min, max);

            System.out.println("Sorted array: " + Arrays.toString(array));
        }

        public static int findMin(int[] array) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }

        public static int findMax(int[] array) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }

        public static void linearSort(int[] array, int min, int max) {
            int range = max - min + 1;
            int[] count = new int[range];
            int[] output = new int[array.length];

            // Count occurrences of each element
            for (int i = 0; i < array.length; i++) {
                count[array[i] - min]++;
            }

            // Place elements in correct position in output array
            int index = 0;
            for (int i = 0; i < range; i++) {
                for (int j = 0; j < count[i]; j++) {
                    output[index++] = i + min;
                }
            }

            // Copy sorted elements back to original array
            System.arraycopy(output, 0, array, 0, array.length);
        }
    }
