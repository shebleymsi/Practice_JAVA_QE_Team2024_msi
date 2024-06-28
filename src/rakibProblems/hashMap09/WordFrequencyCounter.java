package rakibProblems.hashMap09;

import java.util.HashMap;
import java.util.Map;
public class WordFrequencyCounter {

        public static void main(String[] args) {
            String sentence = "This is a simple sentence. This is a Java program.";
            Map<String, Integer> wordFrequency = new HashMap<>();

            String[] words = sentence.split(" ");
            for (String word : words) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }

            // Print the word frequency
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }


