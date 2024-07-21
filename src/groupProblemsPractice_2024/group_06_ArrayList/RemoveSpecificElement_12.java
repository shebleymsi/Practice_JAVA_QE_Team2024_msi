package groupProblemsPractice_2024.group_06_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveSpecificElement_12 { //done
    public static void main(String[] args) {
        // Create an ArrayList and initialize it with some elements including duplicates of "apple"
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "apple", "date", "apple"));

        // Remove all occurrences of the element "apple"
        list.removeAll(Collections.singleton("apple"));

        // Print the ArrayList after removing all occurrences of "apple"
        System.out.println("ArrayList after removing all occurrences of 'apple': " + list);
    }
}