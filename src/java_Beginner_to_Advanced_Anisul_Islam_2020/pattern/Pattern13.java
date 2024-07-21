
package java_Beginner_to_Advanced_Anisul_Islam_2020.pattern;

import java.util.Scanner;


public class Pattern13 {
        public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter any number : ");
        int n = input.nextInt();
        
        for (int row = n; row >=1; row--) {
            for (int col = 1; col <=n-row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("#");// problem for number
            }
            System.out.println(" ");
            
        }
    }
    
}
