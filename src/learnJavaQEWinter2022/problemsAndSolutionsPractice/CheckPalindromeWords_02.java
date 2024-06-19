package learnJavaQEWinter2022.problemsAndSolutionsPractice;

public class CheckPalindromeWords_02 {

    public static void main(String[] args) { // hard
        String word = "MADAM";
        checkPalindrome(word);
    }

    public static void checkPalindrome(String word) {
        String lowerCaseWord = word.toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < lowerCaseWord.length() / 2; i++) {
            if (lowerCaseWord.charAt(i) != lowerCaseWord.charAt(lowerCaseWord.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "Yes" : "No");
    }
}
