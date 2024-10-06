package top_SDET_JAVA_Programs_Kushal_Parikh_IMPORTANT.sdet_03_arrays;

import java.util.HashSet;
import java.util.Set;

public class SDET_01_Common_Elements_of_Two_Array {
    //Find common elements between  two arrays
    //Input: array1 = {1,2,3,4,5} and  array2 = {4,5,6,7,8}
    //Output: Common elements: [4, 5]

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        Set<Integer> commonElements = findCommonElements(array1, array2);
        System.out.println("Common elements: " + commonElements);
    }

    public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();
        // Add elements of the first array to the set
        for (int num : array1) {
            set1.add(num);
        }
        // Check for common elements in the second array
        for (int num : array2) {
            if (set1.contains(num)) {
                commonSet.add(num);
            }
        }
        return commonSet;
    }

}
