package problems_midTermPractice_2022_2024.practice_01_problemAndSolutions;

public class SearchElementOfArray_04_01 {
    // Using the sequential(linear)search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.
    public static void main(String[] args) {
        int[] array = {34, 7, 23, 32, 5, 62, 32, 74, 21, 30};
        int targetElement = 74;

        int result = sequentialSearch(array, targetElement);

        if (result == -1) {
            System.out.println("Element " + targetElement + " not found in the array.");
        } else {
            System.out.println("Element " + targetElement + " found at index: " + result);
        }
    }

    public static int sequentialSearch(int[] array, int targetElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetElement) {
                return i;
            }
        }
        return -1;
    }
}
