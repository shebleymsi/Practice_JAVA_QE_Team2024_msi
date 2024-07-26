
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.beignnerjava;

import java.util.Scanner;


public class SeriesMulti3 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, result=1;
        System.out.print("Enter final number = ");
        n = input.nextInt();
        
        for (int i = 2; i <=n;i= i+2) {
            
            result = result*i;
            System.out.print(i+" ");
            
        }
        System.out.println(" ");
        System.out.println("result  "+result);
    }
    
    
}
