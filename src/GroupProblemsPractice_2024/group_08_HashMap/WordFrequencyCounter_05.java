package GroupProblemsPractice_2024.group_08_HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter_05 {

    public static void main(String[] args) {
        // Define a sentence to analyze
        String sentence = "This is a simple sentence. This is a Java program.";

        // Split the sentence into words based on spaces
        // This statement splits the sentence into words based on a single space character.
        String[] words = sentence.split(" ");
        System.out.println("-----------"+ Arrays.toString(words)); // [This, is, a, simple, sentence., This, is, a, Java, program.]

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordFrequency = new HashMap<>();
        // Iterate over the words using an index-based loop to count their frequencies
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            // Add the word to the map or update its frequency
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // Print the word frequencies
        System.out.println("***************" + wordFrequency);
    }



    //        // Iterate over the words to count their frequencies
//        for (String word : words) {
//            // Add the word to the map or update its frequency
//            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
//        }


}

