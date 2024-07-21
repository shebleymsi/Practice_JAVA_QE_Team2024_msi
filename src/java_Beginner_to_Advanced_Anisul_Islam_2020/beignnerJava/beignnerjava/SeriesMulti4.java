
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.beignnerjava;

import java.util.Scanner;


public class SeriesMulti4 {
                public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n, result=1;
        System.out.print("Enter final number = ");
        n = input.nextDouble();
        
        for (double i = 1.5; i <=n;i= i+1) {
            
            result = result*i;
            System.out.print(i+" ");
            
        }
        System.out.println(" ");
        System.out.println("result  "+result);
    }
    
    
}
