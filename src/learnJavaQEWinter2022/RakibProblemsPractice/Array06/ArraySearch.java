package learnJavaQEWinter2022.RakibProblemsPractice.Array06;


    public class ArraySearch {
        public static void main(String[] args) {
            int[] array = {10, 20, 30, 40, 50};
            int target = 10;
            int index = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                System.out.println("Element " + target + " found at index: " + index);
            } else {
                System.out.println("Element not found in the array.");
            }
        }
    }

