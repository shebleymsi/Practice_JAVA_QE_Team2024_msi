package QA_InterviewCode_Capital_One_Bank_Old_2021_2024.string;

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