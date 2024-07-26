package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.array_demo;

import java.util.Scanner;

public class Array5maxmin {

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

        double max = number[0];
        double min = number[0];
        for (int i = 1; i < 5; i++) {

            if (max < number[i]) {
                max = number[i];
            }
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println("Maximum is = " + max);
        System.out.println("Minimum is = " + min);

    }

}
