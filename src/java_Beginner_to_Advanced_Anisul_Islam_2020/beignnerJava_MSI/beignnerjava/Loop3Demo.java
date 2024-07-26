
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.beignnerjava;

import java.util.Scanner;


public class Loop3Demo {
        public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        int m,n,sum = 0;
        
        
        System.out.print("Enter initial intiger number  ");
        m = input.nextInt();
     
        System.out.print("Enter final intiger number  ");
        n = input.nextInt();
     
        for(int i=m;i<=n;i++){
            if(i%2==0){
            sum = sum+i;
            System.out.print(" "+i);
            }
        }
            System.out.println("");
        System.out.println("sum of m to n  all even number is  "+sum);
    }

}
