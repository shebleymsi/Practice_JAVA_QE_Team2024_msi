package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.array_demo;

import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] number = new double[5];
        double sum = 0;
        System.out.print("Please Enter 5 numbers = ");

        for (int i = 0; i < number.length; i++) {  //number.length = 5 = size of arry
            number[i] = input.nextDouble();
        }
        //number[0}=1
        //number[1}=2
        //number[2}=3
        //number[3}=4
        //number[4}=5

        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i]; //sum = 15
        }
        System.out.println("sum of all = " + sum);

        double avg = sum / number.length;
        System.out.println("The Average is  = " + avg);

    }

}
