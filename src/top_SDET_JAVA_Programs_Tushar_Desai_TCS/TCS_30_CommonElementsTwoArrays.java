package top_SDET_JAVA_Programs_Tushar_Desai_TCS;

import java.util.HashSet;

public class TCS_30_CommonElementsTwoArrays {
    //30. Find the Common Elements in Two Arrays
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }

}
