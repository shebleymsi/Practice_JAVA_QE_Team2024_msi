
package java_Beginner_to_Advanced_Anisul_Islam_2020.pattern;

import java.util.Scanner;


public class Pattern25FloyedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,count = 0;
        System.out.print("Enter any number : ");
        n = input.nextInt();
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("");//count++ . how can applyed in java?
            }
            System.out.println("");
        }
        
    
    }
    
}
