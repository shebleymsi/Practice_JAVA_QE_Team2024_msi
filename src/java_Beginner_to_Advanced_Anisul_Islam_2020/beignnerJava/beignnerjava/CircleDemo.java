
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.beignnerjava;

import java.util.Scanner;


public class CircleDemo {
    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        double radius, area;
        
        System.out.print("Enter Radius = ");
        radius = input.nextDouble();
        
        area = 3.141 * radius * radius;
        System.out.println("Area of Circle = "+area);
       
        
    }
    
}
