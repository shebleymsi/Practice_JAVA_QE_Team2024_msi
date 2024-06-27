package RakibProblemsPractice.LinkedList07;

import java.util.Arrays;
import java.util.LinkedList;

public class RemoveDuplicates_04_01_copy {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 1, 2, 3, 3, 4));

        removeDuplicates(linkedList);
        System.out.println("After removing duplicates: " + linkedList);
    }

    public static void removeDuplicates(LinkedList<Integer> linkedList) {
        for (int i = 0; i < linkedList.size() - 1; i++) {
            if (linkedList.get(i).equals(linkedList.get(i + 1))) {
                linkedList.remove(i);
                i--;
            }
        }
    }

}
