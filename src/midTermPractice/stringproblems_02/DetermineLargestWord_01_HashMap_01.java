package midTermPractice.stringproblems_02;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord_01_HashMap_01 {
    // Implement to Find the length and longest word in the given sentence below.
    // String s = "Human brain is a biological learning machine";
    // Should return in console as like: "10 biological".
    public static void main(String[] args) {
        // Step 1: Define the sentence to be analyzed
        String wordGiven = "Human brain is a biological learning machine";

        // Step 2: Call the method to find the longest word and its length
        Map<Integer, String> wordNLength = findTheLargestWord(wordGiven);

        // Print system:01 - Print the raw map output
        //System.out.println(wordNLength);

        // Print system:02 - Iterate through the map to print the key-value pairs
        for (Map.Entry<Integer, String> entry : wordNLength.entrySet()) {
            // Print the length of the longest word and the word itself
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    // Method to find the longest word in a given sentence
    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        // Step 3: Split the given sentence into an array of words
        String[] wordGivenArray = wordGiven.split(" ");

        // Step 4: Initialize a variable to keep track of the longest word found
        String longestWord = "";

        // Step 5: Iterate through each word in the array
        for (String word : wordGivenArray) {
            // Step 6: Update the longestWord if the current word is longer
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Step 7: Create a map to store the length and the longest word
        Map<Integer, String> map = new HashMap<>();
        map.put(longestWord.length(), longestWord);
        

        // Step 8: Return the map containing the length and the longest word
        return map;
    }


}

