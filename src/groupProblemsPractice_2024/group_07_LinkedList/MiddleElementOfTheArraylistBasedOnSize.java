package groupProblemsPractice_2024.group_07_LinkedList;


import java.util.Arrays;
import java.util.LinkedList;

public class MiddleElementOfTheArraylistBasedOnSize {

    // find the Middle Element Of The Arraylist Based On Size?
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(50, 10, 30, 44, 55));

        if (linkedList.size()%2 == 0) {
            getEvenSize(linkedList);
        }else {
            getOddSize(linkedList);
        }

    }

    public static void getEvenSize(LinkedList<Integer> linkedList) {
        int size = linkedList.size();
        int[] middleIndex = new int[2];
        middleIndex[0] = linkedList.get((size / 2) - 1); // even
        middleIndex[1] = linkedList.get((size / 2)); //even
        System.out.println("middle element Even Size : "+Arrays.toString(middleIndex));
    }

    public static void getOddSize(LinkedList<Integer> linkedList) {
        int size = linkedList.size();
        int middleIndex = size / 2; // odd
        int middleElement = linkedList.get(middleIndex);
        System.out.println("middle element Odd Size : "+middleElement);

    }


}
