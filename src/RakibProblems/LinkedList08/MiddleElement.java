package RakibProblems.LinkedList08;
import java.util.LinkedList;

public class MiddleElement {


        public static void main(String[] args) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            linkedList.add(1);
            linkedList.add(2);
            linkedList.add(3);
            linkedList.add(4);
            linkedList.add(5);

            int size = linkedList.size();
            int middleIndex = size / 2;
            int middleElement = linkedList.get(middleIndex);

            System.out.println("Middle element of the linked list: " + middleElement);
        }
    }
