package problemsAndSolutionsPractice_2022_2024;

import java.util.Scanner;

public class CheckEvenOrOddNumbers_Scanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it is even or odd: ");
        int number = input.nextInt();

        checkEvenOrOdd(number);

        input.close();
    }

    public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an Even Number");
        } else {
            System.out.println(number + " is an Odd Number");
        }
    }
}
