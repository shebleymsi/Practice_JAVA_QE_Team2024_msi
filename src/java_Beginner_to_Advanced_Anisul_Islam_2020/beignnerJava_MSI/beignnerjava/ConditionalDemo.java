
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.beignnerjava;

import java.util.Scanner;


public class ConditionalDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, large;
        System.out.print("Enter any two Number = ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        large = (num1>num2)? num1 : num2;
        System.out.println("Large Number = "+large);
        
    }

}
