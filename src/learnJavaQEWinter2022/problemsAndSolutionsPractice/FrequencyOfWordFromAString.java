package learnJavaQEWinter2022.problemsAndSolutionsPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfWordFromAString { // // plz find classname: FrequencyOfNumberFromAnArray

    // Objective: To find the frequency of each word in a given sentence.

    public static void main(String[] args) {

        // Taking user input for the sentence
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the Sentence : ");
//        String input = scanner.nextLine();
        String input = "How are you thank you";

        // Calling the method to count the frequency of words
        count_freq(input);
    }

    // Method to count the frequency of words in a string
    static void count_freq(String str) {


        System.out.println("Original input: "+str);
        // Splitting the input string into words using regular expression "\\s+" (one or more whitespace characters)
        String[] array = str.split("\\s+");
        System.out.println(Arrays.toString(array));


        // Using TreeMap to store words and their frequencies in sorted order
        TreeMap<String, Integer> map = new TreeMap<>();

        // Iterating through each word in the array to count
        // i will catch the array element to input as a key in the new map -->
        // --> and will calculate value according to the formula.
        // "How are you? thank you." ==> [How, are, you, thank, you]


        for (int i = 0; i < array.length; i++) {
            // Checking if the word is already present in the map
            if (map.containsKey(array[i])) {
                // If present, incrementing its frequency by 1
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                // If not present, adding the word to the map with frequency 1
                map.put(array[i], 1);
            }
        }

        //System.out.println(map);

        // Displaying the frequency of each word
        for (Map.Entry<String, Integer> entry : map.entrySet()) { //
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
