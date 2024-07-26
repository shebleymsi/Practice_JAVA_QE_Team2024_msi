
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.beignnerjava;

import java.util.Scanner;

public class SeriesSum3 {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter final number = ");
        int n = input.nextInt();

        int sum=0;
        for (int i = 2; i <=n; i= i+2) {
            sum = sum+i;
            System.out.print(" "+i);
        }
        System.out.println(" ");
        System.out.println("sum  "+sum);
    }
    
    
}
