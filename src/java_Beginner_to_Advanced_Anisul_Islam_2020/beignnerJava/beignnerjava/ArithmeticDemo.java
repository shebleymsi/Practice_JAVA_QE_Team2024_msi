
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.beignnerjava;
import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
       int num1, num2, result;
       
       System.out.print("Enter First number : ");
       num1= input.nextInt();
       
       System.out.print("Enter second number : ");
       num2= input.nextInt();
       
       result = num1+num2;
       System.out.println("Sum = "+result);
       
       result = num1-num2;
       System.out.println("Sub = "+result);
       
       result = num1*num2;
       System.out.println("Multi = "+result);
       
       double result2 = (double) num1/num2;
       System.out.println("Divided = "+result2);
       
       result =  num1%num2;
       System.out.println("Reminder = "+result);
        
    }
    
}
