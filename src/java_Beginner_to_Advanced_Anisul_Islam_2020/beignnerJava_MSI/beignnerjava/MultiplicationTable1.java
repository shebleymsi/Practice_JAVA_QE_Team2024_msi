
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.beignnerjava;

import java.util.Scanner;


public class MultiplicationTable1 {    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int m,n;
        System.out.print("Enter initial number = ");
        m = input.nextInt();
        
        System.out.print("Enter final number = ");
        n = input.nextInt();
        
            System.out.println("");//line gap for output
        
        for (int i = m; i <= n ; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+"x"+j+"="+i*j);//5x1=5 ,so ixj=i*j
        }
            System.out.println("\n\n");//line gap for output

                
      }
        

    }
    
}
