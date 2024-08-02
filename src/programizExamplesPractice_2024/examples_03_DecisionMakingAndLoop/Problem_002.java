package programizExamplesPractice_2024.examples_03_DecisionMakingAndLoop;


import java.util.Scanner;

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
