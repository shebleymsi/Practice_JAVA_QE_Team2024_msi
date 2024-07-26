
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.beignnerjava;

import java.util.Scanner;


public class SeriesSum5 {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum=0;
        System.out.print("Enter final number = ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i= i+1) {
            
            sum = sum+i*i;
            System.out.print(i+"x"+i+" " );
        }
        System.out.println(" ");
        System.out.println("sum  "+sum);
    }
    
    
}
