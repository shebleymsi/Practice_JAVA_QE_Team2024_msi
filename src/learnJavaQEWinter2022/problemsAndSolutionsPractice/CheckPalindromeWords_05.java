package learnJavaQEWinter2022.problemsAndSolutionsPractice;

public class CheckPalindromeWords_05 {

    public static void main(String[] args) {
        System.out.println("DAD is a palindrome word: " + checkPalindrome("DAD"));
        System.out.println("MADAM is a palindrome word: " + checkPalindrome("MADAM"));
        System.out.println("MOM is a palindrome word: " + checkPalindrome("MOM"));
        System.out.println("HAPPY is a palindrome word: " + checkPalindrome("HAPPY"));
        System.out.println("NEW is a palindrome word: " + checkPalindrome("NEW"));
    }

    public static boolean checkPalindrome(String st) {
        char[] word = st.toLowerCase().toCharArray();
        int startingIndex = 0;
        int endingIndex = word.length - 1;

        while (endingIndex > startingIndex) {
            if (word[startingIndex] != word[endingIndex]) {
                return false; // Not a palindrome
            }
            ++startingIndex;
            --endingIndex;
        }
        return true; // Is a palindrome
    }
}

