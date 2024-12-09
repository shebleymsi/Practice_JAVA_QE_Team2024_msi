package problemsAndSolutionsPractice_2022_2024;

import java.util.Arrays;

public class CheckAnagram {

    public static void main(String[] args) {

        String str1 = "Listen";
        String str2 = "Silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove all whitespace and convert to lowercase
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }

}

//How can I check if two strings are anagrams in Java?

//An anagram is a rearrangement of the letters in a word to form a new word.

//Whitespace and Case Handling: You remove all whitespace and convert both strings to lowercase to ensure the comparison is case-insensitive and not affected by spaces.

//Length Check: If the lengths of the strings are different, they cannot be anagrams.

//Character Array Conversion: You convert the strings to character arrays.

//Sorting: The character arrays are sorted, which allows for a straightforward comparison.

//Comparison: Finally, you compare the sorted arrays. If they are equal, the strings are anagrams.



// why "areAnagrams(str1, str2)" in the main method and "areAnagrams(String str1, String str2)" in the helper method are not the same?
// they are not the same is due to their different contexts and roles in the code:
//areAnagrams(str1, str2) is a method call.
//areAnagrams(String str1, String str2) is a method definition.
