package RakibProblemsPractice.ArrayList06;

import java.util.ArrayList;

public class CharRemoveFromString_18 {

    /*
    🗒️ Objective
    The objective of the above code is to convert a given string into an ArrayList of characters,
    remove specific characters from the list, and then print the resulting list.
    This demonstrates basic operations such as string manipulation, array list creation, and element removal in Java.
     */
    public static void main(String[] args) {

        // Initialize a string with the value "HELLO GOODBYE!"
        String words = new String("HELLO GOODBYE!");

        // Create an ArrayList to hold characters
        ArrayList<Character> sample = new ArrayList<Character>();


        // Loop through each character in the string and add it to the ArrayList
        for (int i = 0; i < words.length(); i++) {
            sample.add(words.charAt(i));
        }
        // Print the ArrayList after adding all characters
        System.out.println(sample);


        // Remove the character at index 4 (originally 'O' in "HELLO")
        sample.remove(4);
        System.out.println(sample);


        // Remove the character now at index 4 (originally space in "HELLO GOODBYE!")
        sample.remove(4);
        // Print the ArrayList after removals
        System.out.println(sample);
    }
}
