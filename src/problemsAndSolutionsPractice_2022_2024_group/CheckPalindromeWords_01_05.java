package problemsAndSolutionsPractice_2022_2024_group;

public class CheckPalindromeWords_01_05 {

    public static void main(String[] args) { // good code
        checkPalindrome("MADA");



    }

    public static boolean checkPalindrome(String st) {
        char[] word = st.toLowerCase().toCharArray();
        int startingIndex = 0;
        int endingIndex = word.length - 1;

        while (endingIndex > startingIndex) {
            if (word[startingIndex] != word[endingIndex]) {
                System.out.println("its not a palindrome");
                return false; // Not a palindrome
            }
            ++startingIndex;
            --endingIndex;
        }
        System.out.println("its a palindrome");
        return true; // Is a palindrome
    }
}

