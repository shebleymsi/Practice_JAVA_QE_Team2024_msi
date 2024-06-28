package rakibProblemsPractice.loop04;

import java.util.Scanner;

public class SumNumbers02 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer number: ");
            int nthNumber = input.nextInt();

            int sum = 0;
            // Using a for-loop to calculate the sum of numbers from 1 to nth number
            for (int i = 1; i <= nthNumber; i++) {
                sum += i;
            }
            System.out.println("Sum of nth integer numbers is: " + sum);
        }
    }
