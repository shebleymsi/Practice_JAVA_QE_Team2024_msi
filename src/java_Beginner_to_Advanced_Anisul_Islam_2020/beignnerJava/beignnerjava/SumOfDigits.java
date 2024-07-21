
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.beignnerjava;

import java.util.Scanner;


public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,temp,r,sum=0;
        System.out.print("Enter any number = ");
        num = input.nextInt();
        
        temp = num;
        
        while(temp !=0){
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
        }
        System.out.println("Sum of digits = "+sum);
    }
    
}
