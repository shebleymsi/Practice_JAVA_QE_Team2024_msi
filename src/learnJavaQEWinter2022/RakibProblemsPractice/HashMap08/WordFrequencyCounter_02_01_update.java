package learnJavaQEWinter2022.RakibProblemsPractice.HashMap08;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter_02_01_update {

    public static void main(String[] args) {
        // Define a sentence to analyze
        String sentence = "This is a simple sentence. This is a Java program.";

        // Remove punctuation from the sentence
        sentence = sentence.replaceAll("[.]", ""); // Removes the period character

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Split the sentence into words based on spaces
        // This statement splits the sentence into words based on one or more whitespace characters.
        String[] words = sentence.split("\\s+");

        // Iterate over the words to count their frequencies
        for (String word : words) {
            // Convert the word to lowercase to make the counting case-insensitive
            word = word.toLowerCase();

            // Add the word to the map or update its frequency
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // Print the word frequencies
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            // Print each word and its corresponding frequency
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
