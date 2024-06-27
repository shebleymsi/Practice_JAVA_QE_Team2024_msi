package RakibProblemsPractice.LinkedList07;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicatesUseSet_04_01 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 1, 2, 3, 3, 4));
        System.out.println("LinkedList before removing duplicates: " + linkedList);


        // Create a HashSet to store unique elements (HashSet automatically removes duplicates)
        HashSet<Integer> uniqueWordSet = new HashSet<>(linkedList);

        // Create a new LinkedList from the unique elements in the HashSet
        LinkedList<Integer> uniqueWords = new LinkedList<>(uniqueWordSet);

        //LinkedList<Integer> uniqueWords = new LinkedList<>(new HashSet<>(linkedList));

        // Print the LinkedList after removing duplicates
        System.out.println("LinkedList after removing duplicates: " + uniqueWords);
    }


}
