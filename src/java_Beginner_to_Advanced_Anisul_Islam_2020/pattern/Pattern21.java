

package java_Beginner_to_Advanced_Anisul_Islam_2020.pattern;

import java.util.Scanner;



public class Pattern21 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any num : ");
        int n = input.nextInt();
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
         }
            for (int row = n-1; row >=1; row--) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    
    }

}
