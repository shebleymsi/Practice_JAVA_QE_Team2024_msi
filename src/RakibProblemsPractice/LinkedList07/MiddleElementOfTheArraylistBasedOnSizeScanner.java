package RakibProblemsPractice.LinkedList07;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class MiddleElementOfTheArraylistBasedOnSizeScanner {

    // find the Middle Element Of The Arraylist Based On Size?
    // size and elements taken from user.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Enter the size of the LinkedList: ");
        int numberOfElements = scanner.nextInt();

        System.out.println("Enter the elements of the LinkedList: ");
        for (int i = 0; i < numberOfElements; i++) {
            linkedList.add(scanner.nextInt());
        }
        System.out.println(linkedList);


        if (linkedList.size() % 2 == 0) {
            getEvenSize(linkedList);
        } else {
            getOddSize(linkedList);
        }

        scanner.close();
    }

    public static void getEvenSize(LinkedList<Integer> linkedList) {
        int size = linkedList.size();
        int[] middleElements = new int[2];
        middleElements[0] = linkedList.get((size / 2) - 1); // even
        middleElements[1] = linkedList.get((size / 2)); // even
        System.out.println("Middle elements for even size: " + Arrays.toString(middleElements));
    }

    public static void getOddSize(LinkedList<Integer> linkedList) {
        int size = linkedList.size();
        int middleIndex = size / 2; // odd
        int middleElement = linkedList.get(middleIndex);
        System.out.println("Middle element for odd size: " + middleElement);
    }
}
