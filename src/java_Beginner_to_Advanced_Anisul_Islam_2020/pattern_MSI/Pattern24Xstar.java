package java_Beginner_to_Advanced_Anisul_Islam_2020.pattern_MSI;

import java.util.Scanner;

public class Pattern24Xstar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = input.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == col || row + col == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
    }
}
