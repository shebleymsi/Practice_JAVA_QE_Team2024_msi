package group_ProblemsPractice_RU_2024.group_04_Loop;

import java.util.Scanner;

public class PrintNumbers0101 {


    // print up to nth integer number.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();

//        // Declare and assign an integer variable
//        int n = 10;

        // Print numbers from 0 to n
        int i;
        for (i = 0; i <= number; i++) {
            System.out.print(i + "\t");
        }
        System.out.println(i);
    }
}

