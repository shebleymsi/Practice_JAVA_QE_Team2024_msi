
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.beignnerjava;

import java.util.Scanner;


public class FehrenheitToCelsiusDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double Fehrenheit, Celsius;
        
        System.out.print("Enter Fehrenheit ");
        Fehrenheit = input.nextDouble();
        
        Celsius = 0.56 * Fehrenheit - 0.56 * 32;
        System.out.println("Celsius = "+Celsius);
        
    }
    
}
