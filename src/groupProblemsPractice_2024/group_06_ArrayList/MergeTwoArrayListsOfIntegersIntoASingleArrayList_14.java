package groupProblemsPractice_2024.group_06_ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class MergeTwoArrayListsOfIntegersIntoASingleArrayList_14 { //done

    public static void main(String[] args) {
        // Write a Java program to merge two ArrayLists of integers into a single ArrayList
        // Input: [1, 2, 3, 4, 5] and [6, 7, 8, 9, 10]
        // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        // Create the first ArrayList and add elements to it
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); // Index 0
        list1.add(2); // Index 1
        list1.add(3); // Index 2
        list1.add(4); // Index 3
        list1.add(5); // Index 4

        // Create the second ArrayList and add elements to it
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6); // Index 0
        list2.add(7); // Index 1
        list2.add(8); // Index 2
        list2.add(9); // Index 3
        list2.add(10); // Index 4

        // Create a new ArrayList to store the merged result
        ArrayList<Integer> mergedList = new ArrayList<>();

        // Add all elements from the first ArrayList to the merged ArrayList
        mergedList.addAll(list1);

        // Add all elements from the second ArrayList to the merged ArrayList
        mergedList.addAll(list2);

        // Print the merged ArrayList
        System.out.println("Merged ArrayList: " + mergedList);

//        //remove duplicates
//        ArrayList<Integer> uniqueMergedList = new ArrayList<>(mergedList);
//        System.out.println("Merged ArrayList after removing duplicates: " + uniqueMergedList);

        HashSet<Integer> newMergedList = new HashSet<>(mergedList);

        // Remove duplicates by creating a new ArrayList with unique elements
        ArrayList<Integer> uniqueMergedList = new ArrayList<>(newMergedList);

        // Print the merged ArrayList after removing duplicates
        System.out.println("Merged ArrayList after removing duplicates: " + uniqueMergedList);
    }
}
