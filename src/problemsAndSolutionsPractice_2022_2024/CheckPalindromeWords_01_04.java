package problemsAndSolutionsPractice_2022_2024;

public class CheckPalindromeWords_01_04 {


    // If a string is reversed and it remains unchanged, that is called palindrome
    // for Example MOM,DAD,MADAM are palindrome
    // So write java code to check if a given String is Palindrome or not

    public static void main(String[] args) {

        checkPalindrome("MADAM");


    }


    public static void checkPalindrome(String st) {

        char[] word = st.toLowerCase().toCharArray();
        // Output: [m, a, d, a, m]
        int startingIndex = 0;
        int endingIndex = word.length - 1;

        boolean isPalindrome = true;

        while (endingIndex > startingIndex) {
            if (word[startingIndex] != word[endingIndex]) {
                isPalindrome = false;
                break;
            }
            ++startingIndex;
            --endingIndex;

        }

       // System.out.println(st + " is a palindrome word " + isPalindrome);
        // or,

        if (isPalindrome) {
            System.out.println(st + " is a palindrome word.");
        } else {
            System.out.println(st + " is not a palindrome word.");
        }

    }


}
