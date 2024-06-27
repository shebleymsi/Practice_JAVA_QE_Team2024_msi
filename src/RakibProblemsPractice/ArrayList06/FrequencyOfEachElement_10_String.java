package RakibProblemsPractice.ArrayList06;

import java.util.ArrayList;
import java.util.HashMap;

public class FrequencyOfEachElement_10_String { //done
    // Write a Java program to find the frequency of each element in an ArrayList.

    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> myString = new ArrayList<>();

        // Add elements to the ArrayList
        myString.add("DHAKA"); // Index 0
        myString.add("NY");    // Index 1
        myString.add("DHAKA"); // Index 2
        myString.add("Khulna"); // Index 3
        myString.add("Khulna"); // Index 4
        myString.add("NY");    // Index 5
        myString.add("DHAKA"); // Index 6

        // Create a HashMap to store the frequency of each string
        HashMap<String, Integer> frequencyMap = new HashMap<>(); // frequencyMap: {} (Empty)

        // Iterate through the ArrayList to compute frequencies
        for (int i = 0; i < myString.size(); i++) {
            // Get the current string
            String currentString = myString.get(i);
            // Update the frequency map with the current string
            frequencyMap.put(currentString, frequencyMap.getOrDefault(currentString, 0) + 1);
        }

        // Print the frequency of each element
        System.out.println("Frequency of each element: " + frequencyMap);
    }
}