package problemsAndSolutionsPractice_2022_2024_group_2025;

import java.util.Scanner;

public class DetermineIncreaseDecreaseOrder {

    // objective:
    // write a program that accept three numbers from the user
    // and prints "Increasing" if the numbers are in increasing order
    // and prints "Decreasing" if the numbers are in decreasing order
    // and prints "nether Increasing or Decrease order" if it's not match with increase or decrease order.

    // Test Data: [ Example ]
    // Input First number : 23
    // Input Second number : 24
    // Input third number : 25

    // 23,24,25 Increasing order
    // 25,24,23 Decreasing order

    public static void main(String[] args) {
        findOutIncreaseDecreaseOrder();


    }

    public static void findOutIncreaseDecreaseOrder() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter Second number");
        int num2 = input.nextInt();
        System.out.println("Enter third number");
        int num3 = input.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Increasing order");

        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Decreasing Order");

        } else {
            System.out.println("nether Increasing or Decrease order");
        }

    }



}
