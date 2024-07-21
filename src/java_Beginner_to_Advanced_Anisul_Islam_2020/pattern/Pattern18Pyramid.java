
package java_Beginner_to_Advanced_Anisul_Islam_2020.pattern;

import java.util.Scanner;

public class Pattern18Pyramid {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = input.nextInt();
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2*row-1; col++) {
                System.out.print(" "+row);
            }
            System.out.println(" ");
            
        }
    }
    
}
