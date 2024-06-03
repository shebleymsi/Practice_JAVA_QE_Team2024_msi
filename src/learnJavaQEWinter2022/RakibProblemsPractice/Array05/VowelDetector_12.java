package learnJavaQEWinter2022.RakibProblemsPractice.Array05;

import java.util.Scanner;

public class VowelDetector_12 {

    //  Problem: An array of vowel has given. Take input of a character from user and check its a vowel
    //  or not.

    public static void main(String[] args) {

        char[] vowel = {'A', 'E', 'I', 'O', 'U'};

        Scanner myChar = new Scanner(System.in);
        System.out.println("Print any character : ");

        char x = myChar.next().toUpperCase().charAt(0);

        if (x == vowel[0] || x == vowel[1] || x == vowel[2] || x == vowel[3] || x == vowel[4]) {

            System.out.println("Its a vowel");

        } else {

            System.out.println("Its not a vowel");
        }
    }
}

