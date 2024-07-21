
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.beignnerjava;

import java.util.Scanner;


public class IfEvenOddDemo { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        
        System.out.print("Enter any positive integer number = ");
        number = input.nextInt();
        
        if(number%2==0){
        System.out.println("Even Number");
        }
        else{
        System.out.println("Odd Number");
        }
        
    }
    
}
