
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.beignnerjava;
import java.util.Scanner;

public class AssignmentDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int x;
        int y;
        
        System.out.print("Enter First Number = ");
        x = input.nextInt();
        
        System.out.print("Enter Second Number = ");
        y = input.nextInt();

        x += y; // x = x+y =
        System.out.println(" x = "+x);
        
        x -= y; // x = x-y = 3
        System.out.println(" x = "+x);
        
        x *= y; // x = x*y =6
        System.out.println(" x = "+x);
        
        x /= y; // x = x/y = 3
        System.out.println(" x = "+x);
        
        x %= y; // x = x%y = 1
        System.out.println(" x = "+x);
        

        
    }
    
}
