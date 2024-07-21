
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.beignnerjava;

import java.util.Scanner;

public class SeiesSum3 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum=0;
        System.out.print("Enter final number = ");
        n = input.nextInt();
        
        for (int i = 2; i <=n; i= i+2) {
            
            sum = sum+i;
            System.out.print(" "+i);
        }
        System.out.println(" ");
        System.out.println("sum  "+sum);
    }
    
    
}
