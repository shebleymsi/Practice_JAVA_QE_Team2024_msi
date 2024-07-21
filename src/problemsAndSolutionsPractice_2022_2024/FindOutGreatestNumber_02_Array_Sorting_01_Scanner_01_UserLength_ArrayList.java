package problemsAndSolutionsPractice_2022_2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindOutGreatestNumber_02_Array_Sorting_01_Scanner_01_UserLength_ArrayList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Use a for loop to populate the array
        for (int i = 0; i <3; i++) {
            System.out.print("Enter the number, input" + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        System.out.println("Original ArrayList: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

        int largest = numbers.get(numbers.size() - 1);
        System.out.println(largest + " is the largest number");
    }
}
