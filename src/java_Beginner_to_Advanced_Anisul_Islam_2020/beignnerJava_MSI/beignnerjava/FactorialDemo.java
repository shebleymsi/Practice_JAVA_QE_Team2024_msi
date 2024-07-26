package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.beignnerjava;

import java.util.Scanner;

public class FactorialDemo {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        int num, factorial = 1;
        System.out.print("Enter any integer number = ");
        num = input.nextInt();

        for (int i = num; i >= 1; i--) {
            factorial = factorial * i;
            System.out.print(i);
        }
        System.out.println("");
        System.out.println("Factorial of " + num + " = " + factorial); 
       
    /*  int num = 5, fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);  */
    }

}
