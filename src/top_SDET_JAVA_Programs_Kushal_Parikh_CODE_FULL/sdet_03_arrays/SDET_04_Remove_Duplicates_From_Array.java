package top_SDET_JAVA_Programs_Kushal_Parikh_CODE_FULL.sdet_03_arrays;

import java.util.HashSet;
import java.util.Set;

public class SDET_04_Remove_Duplicates_From_Array {
    // Remove duplicates from an Array
    //Output:
    //Array with duplicates removed: 1 2 5 6 9
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6, 2, 5};
        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Array with duplicates removed:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }
    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }

}
