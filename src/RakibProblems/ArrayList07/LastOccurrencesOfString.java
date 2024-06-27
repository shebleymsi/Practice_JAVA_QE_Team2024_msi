package RakibProblems.ArrayList07;

import java.util.ArrayList;

public class LastOccurrencesOfString {

    //Find the index of the last occurrence of a specific element in an ArrayList of strings.
    //java.util.ArrayList.lastIndexOf() method is used to get the index of the last occurrence of the
    // specified element in the ArrayList.

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("orange");
        words.add("apple");

        int lastIndex = words.lastIndexOf("apple");

        System.out.println("Last index of 'apple': " + lastIndex);
    }
}
