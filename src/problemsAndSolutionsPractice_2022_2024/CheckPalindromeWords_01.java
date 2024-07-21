package problemsAndSolutionsPractice_2022_2024;

public class CheckPalindromeWords_01 {


    // If a string is reversed and it remains unchanged, that is called palindrome
    // for Example MOM,DAD,MADAM are palindrome
    // So write java code to check if a given String is Palindrome or not

    public static void main(String[] args) {

        checkPalindrome("MADA");
    }


    public static void checkPalindrome(String st) {

        boolean status = true; // Declare & initialize boolean variable

        char[] word = st.toLowerCase().toCharArray();
       // System.out.println("Array initialize"+ Arrays.toString(word)); // Output: [m, a, d, a, m]
        int startingIndex = 0;
        int endingIndex = word.length - 1;

        while (endingIndex > startingIndex) {
            if (word[startingIndex] != word[endingIndex]) { // m != m
                status = false;
                break;
            } else {
                startingIndex = startingIndex + 1; //++startingIndex;
                endingIndex = endingIndex - 1; //--endingIndex;
            }

        }
        System.out.println(st + " is a palindrome word " + status);
    }


}
