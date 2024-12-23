package problemsAndSolutionsPractice_2022_2024_group_2025;

public class CheckPalindromeWords_bazlur_02_for_loop { // bachelor

    public static void main(String[] args) { // hard
        String word = "REDDER";
        checkPalindrome(word);
    }

    public static void checkPalindrome(String word) {

        String lowerCaseWord = word.toLowerCase();
        System.out.println("lowerCaseWord length : "+lowerCaseWord.length());

        boolean isPalindrome = true;

        for (int i = 0; i < lowerCaseWord.length() / 2; i++) {
            if (lowerCaseWord.charAt(i) != lowerCaseWord.charAt(lowerCaseWord.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "Yes" : "No"); // ternary operator Apply
    }
}
