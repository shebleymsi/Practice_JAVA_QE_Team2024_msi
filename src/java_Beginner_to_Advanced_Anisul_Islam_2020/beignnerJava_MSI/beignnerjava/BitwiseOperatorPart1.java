
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.beignnerjava;

import java.util.Scanner;


public class BitwiseOperatorPart1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter two number = ");
        a = input.nextInt();
        b = input.nextInt();
       
        c = a&b;
        System.out.println("a & b = "+c);
        
        c = a|b;
        System.out.println("a | b = "+c);
        
        c = a^b;
        System.out.println("a ^ b = "+c);

        
    }
    
}
