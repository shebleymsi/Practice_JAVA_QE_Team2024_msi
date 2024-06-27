package RakibProblemsPractice.ArrayList06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections; // Import necessary for using Collections.replaceAll

public class ReplaceOccurrencesOfSpecificElement_13 {

    /*
    Objective:
    The objective of the code is to replace all occurrences of a specific element ('b')
    with another element ('x') in an ArrayList of characters using the Collections.replaceAll method.
     */
    public static void main(String[] args) { //done

//        // Create an ArrayList to store characters
//        ArrayList<Character> characters = new ArrayList<>();
//
//        // Add elements to the ArrayList
//        characters.add('a'); // Index 0
//        characters.add('b'); // Index 1
//        characters.add('c'); // Index 2
//        characters.add('b'); // Index 3
//        characters.add('d'); // Index 4

        ArrayList<Character> characters = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'b', 'd'));

        // Replace all occurrences of 'b' with 'x' in the ArrayList
        Collections.replaceAll(characters, 'b', 'x');

        // Print the ArrayList after replacing all 'b' with 'x'
        System.out.println("ArrayList after replacing all 'b' with 'x': " + characters);

    }
}