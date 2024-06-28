package rakibProblemsPractice.linkedList07;

import java.util.LinkedList;

public class MiddleElementOfTheLinkList_03_oddSize {


    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(50); //1
        linkedList.add(10); //2
        linkedList.add(30); //3
        linkedList.add(44); //4
        linkedList.add(55); //5

        System.out.println(linkedList);

        int size = linkedList.size();
        System.out.println(size);


        int middleIndex = size / 2; // odd
        System.out.println("+++++++++++++++" + middleIndex);

        int middleElement = linkedList.get(middleIndex);

        System.out.println("Middle element of the linked list: " + middleElement);


    }
}
