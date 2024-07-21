
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.beignnerjava;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        
        System.out.print("Enter any integer number = ");
        number = input.nextByte();
        
        if(number>0){
        System.out.println("positive");
        }
        else{
        System.out.println("Negative");
        }
        
        
    }
    
}
