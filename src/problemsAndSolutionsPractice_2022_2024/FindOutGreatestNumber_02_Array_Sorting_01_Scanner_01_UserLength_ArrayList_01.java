package problemsAndSolutionsPractice_2022_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FindOutGreatestNumber_02_Array_Sorting_01_Scanner_01_UserLength_ArrayList_01 {

    public static void main(String[] args) {
        
        

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number, input:");
        int input1 = scanner.nextInt();
        System.out.print("Enter the number, input:");
        int input2 = scanner.nextInt();
        System.out.print("Enter the number, input:");
        int input3 = scanner.nextInt();
        System.out.print("Enter the number, input:");
        int input4 = scanner.nextInt();
        System.out.print("Enter the number, input:");
        int input5 = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(input1,input2,input3,input4,input5));

        System.out.println("Original ArrayList: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

        int largest = numbers.get(numbers.size() - 1);
        System.out.println(largest + " is the largest number");
    }
}
