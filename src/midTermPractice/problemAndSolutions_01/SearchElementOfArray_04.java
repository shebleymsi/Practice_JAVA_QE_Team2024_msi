package midTermPractice.problemAndSolutions_01;

public class SearchElementOfArray_04 {
    // Using the sequential(linear)search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.
    public static void main(String[] args) {
        int[] array = {34, 7, 23, 32, 5, 62, 32, 74, 21, 30};
        int target = 23;

        // Sequential search logic
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                result = i;
                break;
            }
        }

        // Result handling
        if (result == -1) {
            System.out.println("Element " + target + " not found in the array.");
        } else {
            System.out.println("Element " + target + " found at index: " + result);
        }
    }
}
