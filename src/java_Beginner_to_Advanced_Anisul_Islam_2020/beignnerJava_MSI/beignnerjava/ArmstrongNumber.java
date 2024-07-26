
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.beignnerjava;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num,sum=0,temp,r;
        System.out.print("Enter any number = ");
        num = input.nextInt();
        
        temp = num;
        
        while(temp !=0){
            r = temp%10;
            sum = sum+r*r*r;
            temp = temp/10;
        }
        if(num==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not a Armstrong number");
        }
    }
    
}
