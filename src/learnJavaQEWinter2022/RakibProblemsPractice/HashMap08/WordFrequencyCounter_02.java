package learnJavaQEWinter2022.RakibProblemsPractice.HashMap08;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter_02 {

    public static void main(String[] args) {
        // Define a sentence to analyze
        String sentence = "This is a simple sentence. This is a Java program.";

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordFrequency = new HashMap<>();


        // Split the sentence into words based on spaces
        // This statement splits the sentence into words based on a single space character.
        String[] words = sentence.split(" ");

        // Iterate over the words to count their frequencies
        for (String word : words) {
            // Add the word to the map or update its frequency
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // Print the word frequencies
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            // Print each word and its corresponding frequency
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
