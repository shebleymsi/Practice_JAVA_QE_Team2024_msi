package java_Programming_EXERCISE_ANM_Bazlur_Rahman_2025_RUNNING.ch_05_Array;

import java.util.Scanner;

public class Pg_50_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number which we want to add with first array elements: "); //100
        int num = scanner.nextInt();

        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] SecondArray = new int[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            SecondArray[i] = firstArray[i] + num;
        }

        for (int element : SecondArray) {
            System.out.print(element + " ");
        }
    }

}

