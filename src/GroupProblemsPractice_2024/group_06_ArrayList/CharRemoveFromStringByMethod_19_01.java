package GroupProblemsPractice_2024.group_06_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CharRemoveFromStringByMethod_19_01 {
    public static void main(String[] args) {

        String str = "My name is Geeks. Your name is Msi.";

        // Remove the first occurrence of the period "." from the string
        String modifiedStr = str.replaceFirst("\\.", "");

        // Print the modified string
        System.out.println(modifiedStr);

        String modifiedStr1 = modifiedStr.replaceFirst("\\.", "");
        System.out.println(modifiedStr1);

        // Split the string by spaces to get individual words
        String[] wordsArray = modifiedStr1.split(" ");

        // Convert the array to an ArrayList
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));

        // Print the ArrayList
        System.out.println(wordsList);
    }
}