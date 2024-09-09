package top_SDET_JAVA_Programs_Tushar_Desai_TCS;

import java.util.HashSet;

public class TCS_10_RemoveDuplicates {
    //10. Remove Duplicates from an Array
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println(set);
    }

}
