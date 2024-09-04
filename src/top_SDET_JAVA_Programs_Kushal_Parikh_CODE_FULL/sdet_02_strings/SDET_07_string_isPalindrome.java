package top_SDET_JAVA_Programs_Kushal_Parikh_CODE_FULL.sdet_02_strings;

public class SDET_07_string_isPalindrome {
    //7.) Java program to find if a string is Palindrome
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
