package top_SDET_JAVA_Programs_Kushal_Parikh_IMPORTANT.sdet_01_common;

import java.util.Scanner;

public class SDET_01_Odd_Even_number {
    //Java program to find Odd or Even number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter an integer number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + "this even number");

        } else {
            System.out.println(number + "this odd number");
        }
    }
}
