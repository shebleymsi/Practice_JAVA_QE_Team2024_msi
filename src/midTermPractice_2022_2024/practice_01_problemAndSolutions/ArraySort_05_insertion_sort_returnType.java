package midTermPractice_2022_2024.practice_01_problemAndSolutions;

import java.util.Arrays;

public class ArraySort_05_insertion_sort_returnType {

    public static void main(String[] args) {
        int[] numbers = {20, 10, 9, 15, 2};
        String result = Arrays.toString(getInsertionSort(numbers));
        System.out.println(result);

    }

    public static int[] getInsertionSort(int[] numbers){
        // Loop through each element in the array
        for (int i = 1; i < numbers.length; i++) {
            // Store the current element to be compared
            int point = numbers[i];
            // Initialize the previous index
            int j = i - 1; //
            // Shift elements of the array that are greater than 'point' to one position ahead

            while (j >= 0 && numbers[j] > point) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            // Place 'point' in its correct position
            numbers[j + 1] = point;
        }
        return numbers;
    }
}
