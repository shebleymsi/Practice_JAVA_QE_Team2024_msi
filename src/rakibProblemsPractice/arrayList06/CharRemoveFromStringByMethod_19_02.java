package rakibProblemsPractice.arrayList06;

import java.util.ArrayList;
import java.util.Arrays;

public class CharRemoveFromStringByMethod_19_02 {

    /*
     This code effectively removes the specified characters ("." and "?") from the input string
     and then converts the modified string into an ArrayList of words.
     */

    public static void main(String[] args) {
        // Initialize the string to be manipulated
        String str = "My name is Geeks. Your name is Msi. Whats her name?";
        System.out.println("Original string: " + str);

        // Remove all occurrences of the period (".") from the string
        String modifiedStr = str.replace(".", "");
        System.out.println("Modified string: " + modifiedStr);

        // Remove all occurrences of the question mark ("?") from the modified string
        String modifiedStr1 = modifiedStr.replace("?", "");
        System.out.println("Modified string1: " + modifiedStr1);

        // Split the modified string by spaces to get individual words
        String[] wordsArray = modifiedStr1.split(" ");

        // Convert the array of words to an ArrayList
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));

        // Print the resulting ArrayList
        System.out.println(wordsList);
    }
}
