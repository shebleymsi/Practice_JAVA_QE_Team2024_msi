package learnJavaQEWinter2022.RakibProblemsPractice.LinkedList07;

import java.util.Arrays;
import java.util.LinkedList;

public class MiddleElementOfTheLinkList_03_EvenSize {


    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(50); //1
        linkedList.add(10); //2
        linkedList.add(30); //3
        linkedList.add(44); //4
        linkedList.add(55); //5
        linkedList.add(51); //5

        System.out.println(linkedList);

        int size = linkedList.size();
        System.out.println(size);

        int[] middleIndex = new int[2];
        middleIndex[0] = linkedList.get((size / 2) - 1);
        middleIndex[1] = linkedList.get((size / 2));

        System.out.println(Arrays.toString(middleIndex));
        System.out.println("First middleIndex: " + middleIndex[0] + " Second middleIndex: " + middleIndex[1]);

    }
}
