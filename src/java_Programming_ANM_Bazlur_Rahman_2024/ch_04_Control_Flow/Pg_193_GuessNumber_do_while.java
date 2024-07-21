package java_Programming_ANM_Bazlur_Rahman_2024.ch_04_Control_Flow;

import java.util.Scanner;

public class Pg_193_GuessNumber_do_while { // pg:193 related pg:168
    public static void main(String[] args) {
        int number = 15;
        Scanner input = new Scanner(System.in);
        int guessNumber;

        do {
            System.out.print("guess a integer Number: ");
            guessNumber = input.nextInt();
            if (guessNumber == number) {
                System.out.println("Congratulation! you guess the number properly.");
            } else if (number < guessNumber) {
                System.out.println("The number is less than "+ guessNumber);
            } else{
                System.out.println("The number is grater than "+ guessNumber);
            }
        }while (guessNumber != number);
    }
}
