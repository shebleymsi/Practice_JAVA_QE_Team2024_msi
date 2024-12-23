package problemsAndSolutionsPractice_2022_2024_group_2025;

public class CheckPalindromeWords_01_06 {

    public static void main(String[] args) {

        String word= "Never odd or even";

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {

        str = str.replaceAll("\\s+", "").toLowerCase();
        //str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(str);
        int leftIndex = 0;
        int rightIndex = str.length() - 1;

        while (leftIndex < rightIndex) {
            if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
                return false; // Not a palindrome if mismatch occurs
            }
            leftIndex++;
            rightIndex--;
        }
        return true; // Palindrome if the whole string was checked without mismatches
    }
}

