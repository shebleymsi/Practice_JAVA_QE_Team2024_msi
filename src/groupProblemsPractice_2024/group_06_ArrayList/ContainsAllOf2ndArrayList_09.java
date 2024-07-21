package groupProblemsPractice_2024.group_06_ArrayList;

import java.util.ArrayList;

public class ContainsAllOf2ndArrayList_09 { // done
    public static void main(String[] args) {
        // Creating the first ArrayList with some strings
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("orange");

        // Creating the second ArrayList with some strings
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("banana");
        list2.add("orange");

        // Checking if list1 contains all elements of list2
        boolean containsAll = list1.containsAll(list2);

        // Printing the result of the containsAll check
        System.out.println("Does list1 contain all elements of list2? " + containsAll);

        // Another way to print the result directly without storing in a variable
        System.out.println("Does list1 contain all elements of list2? " + list1.containsAll(list2));
    }
}
