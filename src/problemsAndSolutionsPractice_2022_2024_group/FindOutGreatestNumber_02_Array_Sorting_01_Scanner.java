package problemsAndSolutionsPractice_2022_2024_group;

import java.util.Arrays;
import java.util.Scanner;

public class FindOutGreatestNumber_02_Array_Sorting_01_Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number, input1: ");
        int input1 = scanner.nextInt();
        System.out.print("Enter the number, input2: ");
        int input2 = scanner.nextInt();
        System.out.print("Enter the number, input3: ");
        int input3 = scanner.nextInt();


        int[] numbers = new int[3];
        numbers[0]=input1;
        numbers[1]=input2;
        numbers[2]=input3;
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int largest = numbers[numbers.length - 1];
        System.out.println(largest + " is the largest number");
    }
}


