package top_programizExamplesPractice_2024_running.examples_01_Introduction;

import java.util.Scanner;


public class Problem_007_Odd {

    //Example 1: Check whether a number is odd or even using if...else statement
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if (num % 2 != 0)
            System.out.println(num + " is odd");
        else
            System.out.println(num + " is even");
    }
}





