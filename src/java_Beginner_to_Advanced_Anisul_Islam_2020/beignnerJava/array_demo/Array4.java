package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.array_demo;

import java.util.Scanner;

public class Array4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        double sum = 0;
        System.out.print("Enter 5 numbers = ");

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println("sum of all = " + sum);

        double avg = sum / number.length;
        System.out.println("Average is = " + avg);

    }

}
