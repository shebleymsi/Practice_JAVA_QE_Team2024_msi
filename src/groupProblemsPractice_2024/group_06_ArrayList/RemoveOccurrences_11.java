package groupProblemsPractice_2024.group_06_ArrayList;

import java.util.ArrayList;
import java.util.Collections; // Import necessary for using Collections.singleton()

public class RemoveOccurrences_11 { //done
    // Remove all occurrences of a specific element from an ArrayList of integers.
    // java.util.Collections.singleton() method is used to return an immutable set containing only the specified object.

    public static void main(String[] args) { //done
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(1); // Index 0
        numbers.add(2); // Index 1
        numbers.add(3); // Index 2
        numbers.add(2); // Index 3
        numbers.add(4); // Index 4
        numbers.add(2); // Index 5

        System.out.println("Original list: " + numbers);


        // Remove all occurrences of the integer 2 from the ArrayList
        numbers.removeAll(Collections.singleton(2));


        // Print the ArrayList after removing all occurrences of 2
        System.out.println("ArrayList after removing all occurrences of 2: " + numbers);
    }
}