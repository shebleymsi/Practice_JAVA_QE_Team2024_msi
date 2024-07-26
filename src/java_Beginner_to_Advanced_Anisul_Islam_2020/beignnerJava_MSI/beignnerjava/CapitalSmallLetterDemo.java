
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.beignnerjava;

import java.util.Scanner;


public class CapitalSmallLetterDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter any letter = ");
        ch = input.next().charAt(0);
        
        if(ch>='A'&&ch<='Z'){
            System.out.println("Capital letter");
        }
        else if(ch>='a'&&ch<='z'){
           System.out.println("Small letter");  
        }
        else{
             System.out.println("Not a letter");
        }
        
    }
    
}
