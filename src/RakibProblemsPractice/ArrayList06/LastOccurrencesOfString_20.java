package RakibProblemsPractice.ArrayList06;

import java.util.ArrayList;

public class LastOccurrencesOfString_20 {

    // Main method to execute the program
    public static void main(String[] args) { //done

         //Initialize an ArrayList of strings with sample values
         ArrayList<String> words = new ArrayList<>();
         words.add("apple");
         words.add("banana");
         words.add("apple");
         words.add("orange");
         words.add("apple");

//        // An alternative way to initialize the ArrayList with values
//        ArrayList<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "apple"));

        // Find the last occurrence index of the string "apple"
        int lastIndex = words.lastIndexOf("apple");

        // Print the index of the last occurrence of "apple"
        System.out.println("Last index of 'apple': " + lastIndex);
    }
}
