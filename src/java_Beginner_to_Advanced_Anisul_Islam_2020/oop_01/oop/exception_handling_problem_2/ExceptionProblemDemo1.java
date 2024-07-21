package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_01.oop.exception_handling_problem_2;

import java.util.Scanner;

public class ExceptionProblemDemo1 {

    public static void main(String[] args) {
        
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Please enter num1 : ");
                int num1 = input.nextInt();
                System.out.print("Please enter num2 : ");
                int num2 = input.nextInt();
                int result = num1 / num2;
                System.out.println("Result : " + num1 + "/" + num2 + " = " + result);
            } catch (Exception e) {
                System.out.println("Exception : " + e);
                System.out.println("You must enter integer. Please try again");
            }
        }

    }

}
