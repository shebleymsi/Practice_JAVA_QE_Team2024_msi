package problems_midTermPractice_2022_2024_group_2025.practice_03_mathproblems;

public class Math_06_LowestNumber_use_InsertionSort_while_loop_100_100 {
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
//1.================================================================================================Store
        // Loop through each element in the array starting from the second element
        for (int i = 1; i < numbers.length; i++) {
            // Store the current element to be compared
            int point = numbers[i];

//2.================================================================================================lara-chara
            // Initialize the previous index
            int j = i - 1;
            // Shift elements of the array that are greater than 'point' to one position ahead
            while (j >= 0 && numbers[j] > point) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }

//3.================================================================================================correct position
            // Place 'point' in its correct position
            numbers[j + 1] = point;
        }
//4.================================================================================================return numbers
        // Return the sorted array
        return numbers;
//================================================================================================
    }

}

