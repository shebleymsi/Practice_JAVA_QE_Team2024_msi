package learnJavaQEWinter2022.RakibProblems.Array06;

public class ArrayMinimum {

        public static void main(String[] args) {
            int[] array = {50, 30, 20, 40, 10};
            int min = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }

            System.out.println("Minimum element in the array: " + min);
        }
    }

