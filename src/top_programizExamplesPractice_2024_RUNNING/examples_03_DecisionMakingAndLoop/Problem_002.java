package top_programizExamplesPractice_2024_RUNNING.examples_03_DecisionMakingAndLoop;


import java.util.Scanner;

//Example: Check if a Number is Positive or Negative using if else
public class Problem_002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("number is negative");
        } else if (number > 0) {
            System.out.println("number is positive");
        }else {
            System.out.println(" number is zero");
        }
    }

}
