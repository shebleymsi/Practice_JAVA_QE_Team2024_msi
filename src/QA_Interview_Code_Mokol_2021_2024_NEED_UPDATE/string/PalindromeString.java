package QA_Interview_Code_Mokol_2021_2024_NEED_UPDATE.string;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "mom";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (rev.equals(str)) {
            System.out.println("It is a string.Palindrome.");
        } else {
            System.out.println("It's not a palindrome.");
        }}}