
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.beignnerjava;

import java.util.Scanner;

public class FabonacciDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, first = 0, second = 1, fibo;
        
        System.out.print("How many numbers : ");
        n = input.nextInt();
                
        System.out.print(first+" "+second);// 0 1
        
        for (int i = 3; i <= n; i++) { // 1  2  3  5  8  13
            fibo = first+second;
            System.out.print(" "+fibo);
            first = second;
            second = fibo;
        }
        System.out.println(" ");// for line
       
    }
    
}
