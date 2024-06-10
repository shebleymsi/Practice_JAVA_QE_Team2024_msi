package learnJavaQEWinter2022.RakibProblemsPractice.ArrayList06;

import java.util.ArrayList;
import java.util.Arrays;

public class CharRemoveFromStringByMethod_19_02 {
    public static void main(String[] args) {
        String str = "My name is Geeks. Your name is Msi";

        // Split the string by spaces to get individual words
        String[] wordsArray = str.split(" ");

        // Convert the array to an ArrayList
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));

        // Print the ArrayList
        System.out.println(wordsList);
    }
}