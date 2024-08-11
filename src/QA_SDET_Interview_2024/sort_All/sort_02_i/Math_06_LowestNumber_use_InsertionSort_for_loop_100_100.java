package QA_SDET_Interview_2024.sort_All.sort_02_i;

public class Math_06_LowestNumber_use_InsertionSort_for_loop_100_100 {
    //This program finds the lowest number in an array using the insertion sort algorithm.
    //Write java solution to find the lowest number from this array.
    //int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
    //find the lowest number from the array

    //why we start i=1 in for-loop?
    //the loop starts with i = 1 instead of i = 0 because the first element in the array is considered already "sorted"
    //When i = 1, the algorithm considers the sub-array consisting of just the first element [211] as already sorted.
    public static void main(String[] args) {
        // Initialize an array with given elements
        int numbers[] = {211, 110, 99, 34, 67, 89, 67, 456, 321, 67, 5, 679, 54, 32, 65};
        // Sort the array using insertion sort and get the sorted array
        int[] array = getInsertionSort(numbers);
        // Print the first element of the sorted array, which is the smallest element
        System.out.println(array[0]);
    }

    // Method to perform insertion sort on the array
    public static int[] getInsertionSort(int[] numbers) {
        // Loop through each element in the array starting from the second element
        for (int i = 1; i < numbers.length; i++) {
            // Store the current element to be compared
            int point = numbers[i];

            int j;
            // Shift elements of the array that are greater than 'point' to one position ahead
            for (j = i - 1; j >= 0 && numbers[j] > point; j--) {
                numbers[j + 1] = numbers[j];
            }
            // Place 'point' in its correct position
            numbers[j + 1] = point;
        }
        // Return the sorted array
        return numbers;
    }

}

