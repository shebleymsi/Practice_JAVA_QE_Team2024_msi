package learnJavaQEWinter2022.RakibProblemsPractice.Array05;

public class ArraySearch_09_new {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 50;
        int index = -1; // Initialize index to -1 to indicate not found by default

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i;
                break; // Exit the loop once the target is found
            }
        }

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
