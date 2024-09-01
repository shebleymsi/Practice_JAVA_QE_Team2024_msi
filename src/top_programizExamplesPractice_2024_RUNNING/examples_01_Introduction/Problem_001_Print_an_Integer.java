package top_programizExamplesPractice_2024_RUNNING.examples_01_Introduction;

import java.util.Scanner;

public class Problem_001_Print_an_Integer {
    //Example: How to Print an Integer entered by an user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer number: ");
        int input = scanner.nextInt();

        System.out.println("Integer entered by an user is : " + input);
    }


}
