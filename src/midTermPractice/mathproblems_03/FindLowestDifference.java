package midTermPractice.mathproblems_03;

import java.util.*;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        // Java Code to find The Lowest
        // Difference between two Arrays
        //int [] array1 = {30,12,5,9,2,20,33,1};
        //int [] array2 = {18,25,41,47,17,36,14,19};

        // Input given array array1
        int array1[] = {30, 12, 5, 9, 2, 20, 33, 1};

        // Input given array array2
        int array2[] = {18, 25, 41, 47, 17, 36, 14, 19};


        // Calculate size of Both arrays
        int m = array1.length;
        int n = array2.length;

        // Call function to
        // print smallest result
        System.out.println(" The lowest difference between cell is  " + findSmallestDifference(array1, array2, m, n));
    }


    // function to calculate Small
    // Result between two arrays
    static int findSmallestDifference(int array1[], int array2[], int m, int n) {
        // Sort both arrays
        // using sort function
        Arrays.sort(array1);
        Arrays.sort(array2);

        int a = 0, b = 0;

        // Initialize result as max value
        int result = Integer.MAX_VALUE;

        // Scan Both Arrays up-to
        // size of the Arrays
        while (a < m && b < n) {
            if (Math.abs(array1[a] - array2[b]) < result)
                result = Math.abs(array1[a] - array2[b]);

            // Move Smaller Value
            if (array1[a] < array2[b])
                a++;

            else
                b++;
        }

        // return final small result
        return result;
    }

}

