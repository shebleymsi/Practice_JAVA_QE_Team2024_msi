package problems_midTermPractice_2022_2024_group.practice_03_mathproblems;
public class Math_08_FindLowestDifference_02 {
    //Implement in java.
    //Read this below two array.
    //Find the lowest difference between the two array cell.
    //The lowest difference between cells is 1
    //Java Code to find The Lowest Difference between two Arrays
    //int [] array1 = {30,12,5,9,2,20,33,1};
    //int [] array2 = {18,25,41,47,17,36,14,19};
    //This program is designed to find:
    //the lowest difference between any two elements, one from each of the two given arrays

    //int minDifference = Integer.MAX_VALUE;
    //int difference = Math.abs(array1[i] - array2[j]);
    public static void main(String[] args) {
        // Define the two arrays
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        // Find the lowest difference
        int lowestDifference = findLowestDifference(array1, array2);

        // Print the result
        System.out.println("The lowest difference between the two array cells is " + lowestDifference);
    }

    // Static helper method to find the lowest difference between two arrays
    public static int findLowestDifference(int[] array1, int[] array2) {
        //Initialize the minimum difference to a large value
        //Why Initialize to Integer.MAX_VALUE? [chatGPT] : How It Works ?
        //Integer.MAX_VALUE is a constant in Java that represents:
        // the maximum value an int can have, which is 2^31 - 1 (or 2147483647).
        int minDifference = Integer.MAX_VALUE;
        // Loop through each element in the first array
        for (int i = 0; i < array1.length; i++) {
            // Loop through each element in the second array
            for (int j = 0; j < array2.length; j++) {
                // Calculate the absolute difference between the current elements
                int difference = Math.abs(array1[i] - array2[j]);
                //|20 - 19| = 1
                //Here, we can see that the pair (20 from array1, 19 from array2) has an absolute difference of 1.

                // Update the minimum difference - if the current difference is smaller
                if (difference < minDifference) {
                    minDifference = difference;
                }
            }
        }
        // Return the minimum difference found
        return minDifference;
    }
}

