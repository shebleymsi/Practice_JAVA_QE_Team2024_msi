package z_practiceNotebook;

import java.util.Arrays;

public class CheckAnagram {

    public static void main(String[] args) {
        String str1 = "Silent";
        String str2 = "Listen";

        if(checkAnagram( str1,  str2)){
            System.out.println("anagram");
        }else{
            System.out.println("not anagram");
        }

    }

    public static boolean checkAnagram(String str1, String str2) {

        str1 = str1.toLowerCase().replaceAll("\\s+", "");
        str2 = str2.toLowerCase().replaceAll("\\s+", "");

        if(str1.length() != str2.length()){
            return false;
        }

        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();

        Arrays.sort(charStr1);
        Arrays.sort(charStr2);

        return Arrays.equals(charStr1, charStr2);

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