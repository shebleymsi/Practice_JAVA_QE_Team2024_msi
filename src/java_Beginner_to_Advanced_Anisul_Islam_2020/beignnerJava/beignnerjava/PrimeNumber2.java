
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.beignnerjava;

import java.util.Scanner;


public class PrimeNumber2 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,count=0;
        System.out.print("Enter any posititve integer : ");
        num = input.nextInt();
        
        for (int i = 2; i < num; i++) {
            if(num%2==0){
                count++;
                break;
            }
            
        }
        if(count==0){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
