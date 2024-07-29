package midTermPractice_2022_2024.practice_03_mathproblems;

public class Math_06_LowestNumber_use_InsertionSort {
    // Write java solution to find the lowest number from this array.
    //int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
    //find the lowest number from the array
    public static void main(String[] args) {
        int numbers[] = {211, 110, 99, 34, 67, 89, 67, 456, 321,67, 5, 679, 54, 32, 65};
        int[] array = getInsertionSort(numbers);
        System.out.println(array[0]);
    }

    public static int[] getInsertionSort(int[] numbers) {
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

