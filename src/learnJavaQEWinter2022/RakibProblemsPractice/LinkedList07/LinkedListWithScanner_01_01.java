package learnJavaQEWinter2022.RakibProblemsPractice.LinkedList07;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListWithScanner_01_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Enter the size of the LinkedList:");
        int numberOfElements = scanner.nextInt();

        System.out.println("Enter the elements of the LinkedList:");
        for (int i = 0; i < numberOfElements; i++) {
            linkedList.add(scanner.nextInt());
        }

        System.out.println("The LinkedList elements are: "+linkedList);

        // Optional: Close the scanner
        scanner.close();
    }
}
