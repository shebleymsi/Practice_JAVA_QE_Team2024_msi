package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.array_demo;

import java.util.Scanner;

public class Array17Matrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        int SumOfDiagonalElements = 0;
        int SumOfUpperTriangleElements = 0;
        int SomOfLowerTriangleElements = 0;

        // Matrix input
        System.out.println("Enter element for matrix ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A [%d][%d] = ", row, col);
                A[row][col] = input.nextInt();
            }
        }
        System.out.println();
        // Printing A matrix
        System.out.print("A = ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + A[row][col]);
            }
            System.out.println();
        }
        //Diagonal, Upper, Lower
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                if (row == col) {
                    SumOfDiagonalElements = SumOfDiagonalElements + A[row][col];
                }
                if (row < col) {
                    SumOfUpperTriangleElements = SumOfUpperTriangleElements + A[row][col];
                }
                if (row > col) {
                    SomOfLowerTriangleElements = SomOfLowerTriangleElements + A[row][col];
                }

            }

        }

        System.out.println("SumOfDiagonalElements = " + SumOfDiagonalElements);
        System.out.println("SumOfUpperTriangleElements = " + SumOfUpperTriangleElements);
        System.out.println("SomOfLowerTriangleElements = " + SomOfLowerTriangleElements);
    }

}
