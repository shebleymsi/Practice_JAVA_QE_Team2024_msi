
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.beignnerjava;

import java.util.Scanner;

public class VowelConsonentDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char character;
        
        System.out.print("Enter any letter = ");
        character = input.next().charAt(0);
        
        if(character == 'a'){
            System.out.println("Vowel");
        }
            else if(character == 'e'){
            System.out.println("Vowel");
        }
            else if(character == 'i'){
            System.out.println("Vowel");
        }
            else if(character == 'o'){
            System.out.println("Vowel");
        }
            else if(character == 'u'){
            System.out.println("Vowel");
        }
            else{
            System.out.println("Consonent");
        }

    }
    
}
