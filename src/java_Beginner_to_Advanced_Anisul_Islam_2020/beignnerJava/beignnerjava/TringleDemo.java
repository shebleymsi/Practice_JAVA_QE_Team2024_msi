
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.beignnerjava;

import java.util.Scanner;


public class TringleDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double base, height, area;
        
        System.out.print("Enter base = ");
        base = input.nextDouble();
        
        System.out.print("Enter height = ");
        height = input.nextDouble();
        
        area = 0.5 * base * height;
        System.out.println("Area of a triangle = "+area);
        
        
        
    }
    
}
