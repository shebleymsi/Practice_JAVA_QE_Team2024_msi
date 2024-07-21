package groupProblemsPractice_2024.group_08_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Practice_03 {

    // want to learn about wordFrequency.getOrDefault(word, 0) + 1 in hashmap

    public static void main(String[] args) {

        String sentence = "This is a simple sentence. This is a Java program.";

        String[]  words= sentence.split(" ");

        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordFrequency);
    }

}
