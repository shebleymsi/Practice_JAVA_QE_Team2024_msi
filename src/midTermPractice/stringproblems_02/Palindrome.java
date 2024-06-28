package midTermPractice.stringproblems_02;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        checkPalindrome("MOM");

        checkPalindrome("DAD");
    }

    public static String checkPalindrome(String st) {
        boolean status = true;
        char[] word = st.toLowerCase().toCharArray();
        int statingIndex = 0;
        int endingIndex = word.length - 1;

        while (endingIndex > statingIndex) {
            if (word[statingIndex] != word[endingIndex]) {
                status = false;
            }
            ++statingIndex;
            --endingIndex;

        }
        System.out.println(st + " is a palindrome word " + status);
        return st;
    }

}

