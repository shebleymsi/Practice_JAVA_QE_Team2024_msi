package java_Programming_ANM_Bazlur_Rahman_2024.ch_04_Control_Flow;

import java.util.Scanner;

public class Pg_168_GuessNumber_if_else { // pg:168 related pg:193
    public static void main(String[] args) {
        int number = 15;
        Scanner input = new Scanner(System.in);
        System.out.print("guess a integer Number: ");
        int guessNumber = input.nextInt();

        if (guessNumber == number) {
            System.out.println("Congratulation! yo guess the number properly.");
        } else if (number < guessNumber) {
            System.out.println("The number is less than "+ guessNumber);
        } else{
            System.out.println("The number is grater than "+ guessNumber);
        }
    }
}
