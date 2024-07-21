package midTermPractice.stringproblems_02;

import java.util.Map;
import java.util.TreeMap;

public class DetermineLargestWord_01_TreeMap { // Group_Study

    public static void main(String[] args) {
        String wordGiven = "Human brain is a biological learning machine";
        String result = findLongestWord(wordGiven);
        System.out.println(result);
    }

    public static String findLongestWord(String wordGiven) {
        // Split the sentence into words
        String[] words = wordGiven.split(" ");

        // TreeMap to store word lengths as keys (automatically sorted)
        TreeMap<Integer, String> map = new TreeMap<>();

        // Populate the TreeMap with word lengths and words
        for (String word : words) {
            map.put(word.length(), word);
        }

        // Get the last entry from TreeMap (which is the longest word)
        Map.Entry<Integer, String> longestEntry = map.lastEntry();
        // Format the result as "length word"
        String result = longestEntry.getKey() + " " + longestEntry.getValue();

        return result;
    }
}
