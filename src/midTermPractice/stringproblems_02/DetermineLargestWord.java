package midTermPractice.stringproblems_02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    // Implement to Find the length and longest word in the given sentence below.
    // String s = "Human brain is a biological learning machine";
    // Should return in console as like: "10 biological".
    public static void main(String[] args) {
        String wordGiven = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(wordGiven);

        //print system:01
        // System.out.println(wordNLength);

        //print system:02
        for (Map.Entry<Integer, String> entry : wordNLength.entrySet()) {
            // Print each word and its corresponding frequency
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        System.out.println("wordGiven: " + wordGiven);

        String[] wordGivenArray = wordGiven.split("\\s+");
        System.out.println("WordGivenArray: " + Arrays.toString(wordGivenArray));

        Map<Integer, String> map = new HashMap<>();
        String longestWord = "";
        for (String word : wordGivenArray) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        map.put(longestWord.length(), longestWord);
        return map;
    }

    //https://www.chegg.com/homework-help/questions-and-answers/use-code-find-answer-question-question-implement-find-length-longest-word-given-sentence---q76220176

}

