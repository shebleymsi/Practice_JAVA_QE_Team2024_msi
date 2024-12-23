package xqe_JavaMathNotebook_2025.xqe_problemsAndSolutions_msi;

public class QE07_CheckPalindromeWords {


    public static void main(String[] args) {
        String str = "Madam"; // Input string

        if (isPalindrome(str)) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false; // Null or empty strings are not palindromes
        }

        // Normalize the string: remove whitespace, ignore case
        str = str.toLowerCase().replaceAll("\\s+", "");

        // Check if the string is the same forwards and backwards
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}




