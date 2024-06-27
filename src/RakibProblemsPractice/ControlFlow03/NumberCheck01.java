package RakibProblemsPractice.ControlFlow03;

import java.util.Scanner;

public class NumberCheck01 {  //done

    public static void main(String[] args) {
        getNumber();
    }

    public static void getNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();

    }

}

