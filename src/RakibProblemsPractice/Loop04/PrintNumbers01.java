package RakibProblemsPractice.Loop04;

import java.util.Scanner;

public class PrintNumbers01 { //done

    // print up to nth integer number.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();

//        // Declare and assign an integer variable
//        int n = 10;

        // Print numbers from 0 to n
        int i = 0;
        for ( ; i <= number; i++) {
            System.out.print(i + "\t");
        }

        System.out.print("\nUser nth input integer number is: " + (i - 1));
    }
}
