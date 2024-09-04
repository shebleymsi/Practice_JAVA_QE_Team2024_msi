package top_SDET_JAVA_Programs_Tushar_Desai_TCS_SMART_CODE;

import java.util.Arrays;

public class TCS_14_Anagram_Check {

    public static void main(String[] args) {
        String str1 = "listen", str2 = "silent";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));
    }

}

