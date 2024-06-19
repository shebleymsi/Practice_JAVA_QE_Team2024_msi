package learnJavaQEWinter2022.problemsAndSolutionsPractice;

public class CheckPalindromeWords_04 {


    // If a string is reversed and it remains unchanged, that is called palindrome
    // for Example MOM,DAD,MADAM are palindrome
    // So write java code to check if a given String is Palindrome or not

    public static void main(String[] args) {
        checkPalindrome("DAD");
        checkPalindrome("MADAM");
        checkPalindrome("MOM");
        checkPalindrome("HAPPY");
        checkPalindrome("NEW");

    }


    public static void checkPalindrome(String st) {

        char[] word = st.toLowerCase().toCharArray();
        int statingIndex = 0;
        int endingIndex = word.length - 1;
        boolean isPalindrome = true;

        while (endingIndex > statingIndex) {
            if (word[statingIndex] != word[endingIndex]) {
                isPalindrome = false;
                break;
            }
            ++statingIndex;
            --endingIndex;

        }

        System.out.println(st + " is a palindrome word " + isPalindrome);

        if (isPalindrome) {
            System.out.println(st + " is a palindrome word.");
        } else {
            System.out.println(st + " is not a palindrome word.");
        }

    }


}
