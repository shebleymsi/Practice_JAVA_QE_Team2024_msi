package learnJavaQEWinter2022.RakibProblemsPractice.HashMap09;

import java.util.HashMap;
import java.util.Map;

public class Practice {

    // want to learn about wordFrequency.getOrDefault(word, 0) + 1 in hashmap

    public static void main(String[] args) {
        String sentence = "This is a simple sentence. This is a Java program.";
        // Map<String, Integer> wordFrequency = new HashMap<>();
        // String[] words = sentence.split(" ");
        // for (String word : words) {
        //     wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        // }
        // for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
        //     System.out.println(entry.getKey() + ": " + entry.getValue());
        // }
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordFrequency);
    }




}
