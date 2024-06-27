package RakibProblemsPractice.ArrayList06;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWithScanner_02_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter the size of elements you want in the ArrayList:");
        int numberOfElements = scanner.nextInt();

        System.out.println("Enter the elements of the ArrayList:");
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.add(scanner.nextInt());
        }

        System.out.println("The ArrayList elements are: " + arrayList);

        // Optional: Close the scanner
        scanner.close();
    }
}
