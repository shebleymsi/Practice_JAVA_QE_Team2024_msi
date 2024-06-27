package RakibProblems.LinkedList08;
import java.util.LinkedList;

public class RemoveDuplicates {

        public static void main(String[] args) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            linkedList.add(1);
            linkedList.add(1);
            linkedList.add(2);
            linkedList.add(3);
            linkedList.add(3);
            linkedList.add(4);

            System.out.println("Linked list before removing duplicates: " + linkedList);

            // print size of linked list
            System.out.println("Size of linked list: " + linkedList.size());

            for (int i = 0; i < linkedList.size() - 1; i++) {
                if (linkedList.get(i).equals(linkedList.get(i + 1))) {
                    linkedList.remove(i);
                    i--;
                }
            }

            System.out.println("Linked list after removing duplicates: " + linkedList);
        }
    }
    