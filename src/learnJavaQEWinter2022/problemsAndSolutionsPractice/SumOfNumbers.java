package learnJavaQEWinter2022.problemsAndSolutionsPractice;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) { //done
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        getTheSumOfNumbers(number);
    }

    public static void getTheSumOfNumbers(int number) {
        int total = 0;
        for (int i = 0; i <= number; i++) {
            total = total + i;
        }
        System.out.println("The Sum Of Numbers is: "+total);
    }

}

