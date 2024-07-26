
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.beignnerjava;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,temp,sum=0,r;
        System.out.print("Enter any integer number = ");
        num = input.nextInt();
        
        temp = num;
        
        while(temp != 0){
            r = temp%10;
            sum = sum*10+r;
            temp = temp/10;
        }
        if(num==sum){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not a Palindrome number");
        }
    }
    
}
