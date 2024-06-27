package RakibProblemsPractice.LinkedList07;

import java.util.Arrays;
import java.util.LinkedList;

public class RemoveDuplicates_04_01_copy_01_easy {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 1, 2, 3, 3, 4));

        LinkedList<Integer> linkedList1 = removeDuplicates(linkedList);
        System.out.println("After removing duplicates: " + linkedList1);
    }

    public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> linkedList) {
        for (int i = 0; i < linkedList.size() - 1; i++) {
            if (linkedList.get(i).equals(linkedList.get(i + 1))) {
                linkedList.remove(i);
                i--; // i = i-1;
            }
        }
        return linkedList;
    }

}
