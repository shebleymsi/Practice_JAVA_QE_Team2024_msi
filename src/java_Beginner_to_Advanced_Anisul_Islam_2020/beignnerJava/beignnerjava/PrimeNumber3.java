
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.beignnerjava;

import java.util.Scanner;

public class PrimeNumber3 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int m,n,count=0,totalPrime=0;
         
         System.out.print("Enter initial integer positive number : ");
         m = input.nextInt();
         System.out.print("Enter final integer positive number : ");
         n = input.nextInt();
         
         for (int i = m; i <= n; i++) {
             for (int j = 2; j <= i-1; j++) {
                 if(i%j==0){
                     count++;
                     break;
                 }
                 
             }
             if (count==0){
                 System.out.println(i);
                 totalPrime++;
             }
             count=0;
        }
         System.out.println("Total Prime Number = "+totalPrime);
        
    }
}
        
        
        
    
   

