package problemsAndSolutionsPractice_2022_2024;

import java.util.Scanner;

public class FindOutSumOfAllTheElements_01_Use_for_and_while {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        System.out.println("Sum using for-loop = "+sumOfElementsUseForLoop(num));
        System.out.println("Sum using while-loop = "+sumOfElementsUseWhileLoop(num));

    }

    public static int sumOfElementsUseForLoop(int num) {

        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        //System.out.println("Sum using for-loop = " + sum);
        return sum;

    }

    public static int sumOfElementsUseWhileLoop(int num) {
        int sum = 0;
        int i = 0;
        while (i <= num) {
            sum = sum + i;
            i++;
        }
        //System.out.println("Sum using while-loop = " + sum);
        return sum;
    }

}
