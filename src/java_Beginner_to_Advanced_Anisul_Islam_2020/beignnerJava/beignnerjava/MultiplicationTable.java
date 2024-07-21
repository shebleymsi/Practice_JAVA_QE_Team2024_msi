
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.beignnerjava;

import java.util.Scanner;


public class MultiplicationTable {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any number = ");
        num = input.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+"x"+i+"="+num*i);
            
        }
    }
    
}
