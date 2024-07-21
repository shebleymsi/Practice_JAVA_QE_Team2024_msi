package groupProblemsPractice_2024.group_08_HashMap;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter_05_01_update_easy {
    public static void main(String[] args) {
        String sentence = "This is a simple sentence. This is a Java program.";
        sentence = sentence.replaceAll("[.]", "");
        String[] words = sentence.split("\\s+");
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i]; //ArrayName[index]
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        System.out.println("Word Frequencies:" + wordFrequency);
    }
}
