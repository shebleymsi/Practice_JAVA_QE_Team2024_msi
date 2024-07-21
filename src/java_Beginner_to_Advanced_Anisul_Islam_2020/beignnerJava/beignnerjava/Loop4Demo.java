
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.beignnerjava;

import java.util.Scanner;

public class Loop4Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int m,n,sum=0;
        
        System.out.print("Enter initial number ");
        m = input.nextInt();
        
        System.out.print("Enter final number ");
        n = input.nextInt();
        
        for(int i=m;i<=n;i++){
            if(i%2==1){
            sum = sum + i;
            System.out.print(" "+i);
            }
        }
        
        System.out.println("");
        System.out.println("Enter sum of all odd number is  "+sum);
        
    }
           
 }
