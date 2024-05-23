package learnJavaQEWinter2022.RakibProblemsPractice.Array05;


    public class ArrayMaximum_06 {
        public static void main(String[] args) {
            int[] array = {10, 20, 30, 40, 50};
            int max = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }

            System.out.println("Maximum element in the array: " + max);
        }
    }

