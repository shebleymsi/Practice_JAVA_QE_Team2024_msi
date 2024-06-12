package learnJavaQEWinter2022.RakibProblemsPractice.LinkedList07;

import java.util.LinkedList;

public class RemoveDuplicates_04_01_01_copy {

    public static void main(String[] args) {
        // Creating a LinkedList with duplicate values
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println("Original LinkedList: " + linkedList);

        // Removing duplicates
        removeDuplicates(linkedList);

        System.out.println("LinkedList after removing duplicates: " + linkedList);
    }

    public static void removeDuplicates(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--; // Decrement j to check the new element at index j
                }
            }
        }
    }
}

