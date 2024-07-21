
package GroupProblemsPractice_2024.group_06_ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromAnArrayListStrings_08 { //done
    public static void main(String[] args) {
        // Objective: Remove duplicates from an ArrayList of Strings

        // Create an ArrayList of Strings containing duplicate elements
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("apple");
        words.add("banana");

//        ArrayList<String> words = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "3"));
//        System.out.println(words);

        // Create a HashSet to store unique elements (HashSet automatically removes duplicates)
        HashSet<String> uniqueWordSet = new HashSet<>(words);

        // Create a new ArrayList from the unique elements in the HashSet
        ArrayList<String> uniqueWords = new ArrayList<>(uniqueWordSet);

        //ArrayList<String> uniqueWords = new ArrayList<>(new HashSet<>(words));

        // Print the ArrayList after removing duplicates
        System.out.println("ArrayList after removing duplicates: " + uniqueWords);
    }
}


