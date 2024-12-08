package z_practiceNotebook;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String str1 = "Silent";
        String str2 = "Silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

    }

    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase().replaceAll("\\s","");
        str2 = str2.toLowerCase().replaceAll("\\s","");

        if(str1.length() != str2.length()){
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        boolean areEqual = Arrays.equals(charArray1, charArray2);

        return areEqual;
    }

}
