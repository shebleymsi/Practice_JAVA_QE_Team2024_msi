package top_SDET_JAVA_Programs_Tushar_Desai_TCS_SMART_CODE;

import java.util.Arrays;

public class TCS_08_MergeArrays {
    //8. Merge Two Arrays
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        System.out.println(Arrays.toString(merged));
    }

}
