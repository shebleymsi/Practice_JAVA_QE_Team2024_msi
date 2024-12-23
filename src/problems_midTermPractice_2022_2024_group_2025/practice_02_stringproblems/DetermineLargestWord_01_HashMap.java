package problems_midTermPractice_2022_2024_group_2025.practice_02_stringproblems;

import java.util.Map;
import java.util.TreeMap;

public class DetermineLargestWord_01_HashMap {
    // Implement to Find the length and longest word in the given sentence below.
    // String s = "Human brain is a biological learning machine";
    // Should return in console as like: "10 biological".
    public static void main(String[] args) {
        // Step 1: Define the sentence to be analyzed
        String wordGiven = "Human brain is a biological learning machine";

        // Step 2: Call the method to find the longest word and its length
        Map<Integer, String> wordNLength = findTheLargestWord(wordGiven);
    }

    // Method to find the longest word in a given sentence
    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        String[] wordGivenArray = wordGiven.split(" ");
        Map<Integer, String> map = new TreeMap<>();
        for (String word : wordGivenArray) {
            map.put(word.length(),word);
        }

        System.out.println(map.keySet().toArray()[map.size()-1] + " " + map.get(map.keySet().toArray()[map.size()-1]));

        return map;
    }


}

