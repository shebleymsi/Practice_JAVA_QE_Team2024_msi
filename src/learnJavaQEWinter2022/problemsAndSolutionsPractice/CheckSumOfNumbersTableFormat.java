package learnJavaQEWinter2022.problemsAndSolutionsPractice;

import java.util.Scanner;

public class CheckSumOfNumbersTableFormat { // optional shebley

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        getTheSumOfNumbers(number);
    }

    public static void getTheSumOfNumbers(int number) {
        int total = 0;
        System.out.println("i\t\ttotal");
        System.out.println("---------------");
        for (int i = 0; i <= number; i++) {
            total = total + i;
            System.out.println(i + "\t\t" + total);
        }

        System.out.println("The Sum Of Numbers is: " + total);
    }
}



