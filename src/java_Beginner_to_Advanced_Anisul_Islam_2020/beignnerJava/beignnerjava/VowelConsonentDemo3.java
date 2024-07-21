
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.beignnerjava;

import java.util.Scanner;


public class VowelConsonentDemo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        
        System.out.print("Enter any letter = ");
        ch = input.next().charAt(0);
        
        if( ch =='a'||ch=='e'||ch=='i'||ch=='0'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        System.out.println("Vowel");
        }
        else{
        System.out.println("Consosent");
        } 
        }
        
    }
    
