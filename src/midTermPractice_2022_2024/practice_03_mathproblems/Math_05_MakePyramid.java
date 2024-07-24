package midTermPractice_2022_2024.practice_03_mathproblems;

import java.util.Scanner;

public class Math_05_MakePyramid {
    /*   Implement a large Pyramid of stars in the screen with java.
            *
           * *
          * * *
         * * * *
        * * * * *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the last row element by an integer number: ");
        int n = input.nextInt();
        printTriangle(n);
    }
        public static void printTriangle(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = n - i; j > 1; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
