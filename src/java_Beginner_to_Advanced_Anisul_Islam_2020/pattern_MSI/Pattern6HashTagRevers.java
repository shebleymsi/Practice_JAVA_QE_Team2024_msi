
package java_Beginner_to_Advanced_Anisul_Islam_2020.pattern_MSI;

import java.util.Scanner;


public class Pattern6HashTagRevers {
                public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = input.nextInt();
        
        for (int row = n; row >=1  ; row--) {
            for (int col = 1; col <=row; col++) {
                System.out.print("#");
            }
            System.out.println("");
            
        }
    }
    
}
