
package java_Beginner_to_Advanced_Anisul_Islam_2020.pattern_MSI;

import java.util.Scanner;


public class Pattern20 {
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
    }
    
}
