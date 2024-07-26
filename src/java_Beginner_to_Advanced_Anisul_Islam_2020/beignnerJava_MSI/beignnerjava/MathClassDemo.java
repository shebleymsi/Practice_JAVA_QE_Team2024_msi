package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.beignnerjava;

import java.util.Scanner;

public class MathClassDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y;
        System.out.print("Enter any two integer numbers = ");
        x = input.nextInt();
        y = input.nextInt();

        int max = Math.max(x, y);
        System.out.println("Maximum = " + max);

        int min = Math.min(x, y);
        System.out.println("Minimum = " + min);

        int abs = Math.abs(y);
        System.out.println("Absolute = " + abs);
        
        double power = Math.pow(x, y);
        System.out.println("X to the power y = " + power);

        int round1 = Math.round(8.49f);
        System.out.println("Round of 8.49 = " + round1);

        int round = Math.round(8.5f);
        System.out.println("Round of 8.5 = " + round);

        double pi = Math.PI;
        System.out.println("PI = " + pi);
        
        // Shortcut System . lecture 97
        
        System.out.println(Math.abs(-9.5));
        
        System.out.println(Math.sqrt(25.0));
        
        System.out.println(Math.pow(2, 3));
        
        System.out.println(Math.PI);
        
        System.out.println(Math.log(2.0));
        System.out.println(Math.log(1));
        
        System.out.println(Math.exp(1));
        
        System.out.println(Math.max(-2.3, -12.8));
        System.out.println(Math.min(-3, 3));
        
        System.out.println(Math.ceil(5.6));
        System.out.println(Math.floor(5.6));
        
        System.out.println(Math.ceil(-5.6));
        System.out.println(Math.floor(-5.6));
        
        System.out.println(Math.ceil(4));
        System.out.println(Math.floor(4));
        
        System.out.println(Math.round(8.5f));
        System.out.println(Math.round(8.49f));

    }

}
