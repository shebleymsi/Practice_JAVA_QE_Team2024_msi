package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.array_demo;

import java.util.Scanner;

public class Array18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        int SumOfDiagonalElements = 0;
        int SumOfUpperTriangleElements = 0;
        int SumOfLowerTriangleElements = 0;

        //inputting elements from User
        System.out.println("Enter Elements of Matrix A : ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A [%d][%d] = ", row, col);
                A[row][col] = input.nextInt();
            }
            System.out.println("");
        }
        // printing matrix A
        System.out.println("A = ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + A[row][col]);

            }
            System.out.println("");

        }
        //Sum Diagonal, Upper & Lower Triangle 
        System.out.println();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                if (row == col) {
                    SumOfDiagonalElements = SumOfDiagonalElements + A[row][col];
                }
                if (row < col) {
                    SumOfUpperTriangleElements = SumOfUpperTriangleElements + A[row][col];
                }
                if (row > col) {
                    SumOfLowerTriangleElements = SumOfLowerTriangleElements + A[row][col];
                }
            }

        }
        System.out.println("SumOfDiagonalElements = " + SumOfDiagonalElements);
        System.out.println("SumOfUpperTriangleElements = " + SumOfUpperTriangleElements);
        System.out.println("SumOfLowerTriangleElements = " + SumOfLowerTriangleElements);

    }

}
