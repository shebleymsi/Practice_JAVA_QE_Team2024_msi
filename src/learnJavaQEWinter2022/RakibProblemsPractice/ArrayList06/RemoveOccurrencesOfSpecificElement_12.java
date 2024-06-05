package learnJavaQEWinter2022.RakibProblemsPractice.ArrayList06;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveOccurrencesOfSpecificElement_12 {
    public static void main(String[] args) {
        // Initialize an ArrayList with some elements
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "apple", "date", "apple"));

        // Print the original list
        System.out.println("Original list: " + list);

        // The element to be removed
        String elementToRemove = "apple";

        // Call the method to remove all occurrences of the specific element
        removeOccurrences(list, elementToRemove);

        // Print the list after removing the element
        System.out.println("List after removing \"" + elementToRemove + "\": " + list);
    }

    /**
     * Removes all occurrences of a specific element from an ArrayList.
     *
     * @param list The ArrayList from which to remove the element
     * @param element The element to be removed
     */
    public static void removeOccurrences(ArrayList<String> list, String element) {
        // Using removeIf method to remove all occurrences of the specific element
        list.removeIf(e -> e.equals(element));
    }
}