

package java_Beginner_to_Advanced_Anisul_Islam_2020.pattern;

import java.util.Scanner;

public class Pattern16Squre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = input.nextInt();
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(" $"+col);
            }
            System.out.println(" ");
        }
        
    }
    
}
