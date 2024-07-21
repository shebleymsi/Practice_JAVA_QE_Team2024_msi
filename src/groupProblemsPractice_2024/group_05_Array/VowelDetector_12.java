package groupProblemsPractice_2024.group_05_Array;

import java.util.Scanner;

public class VowelDetector_12 { //done

    // Problem: An array of vowels is given. Take input of a character from the user and check if it's a vowel or not.

    public static void main(String[] args) {

        // Define an array of vowels (in uppercase) to check against the input character
        char[] vowel = {'A', 'E', 'I', 'O', 'U'};

        // Create a Scanner object to take input from the user
        Scanner myChar = new Scanner(System.in);
        // Prompt the user to print any character
        System.out.println("Print any character : ");

        // Read the input character, convert it to uppercase and get the first character of the input string
        // charAt(0) is to get the first character of a string.
        char x = myChar.next().toUpperCase().charAt(0);

        // Check if the input character matches any character in the vowel array
        if (x == vowel[0] || x == vowel[1] || x == vowel[2] || x == vowel[3] || x == vowel[4]) {
            // If it matches, print "It's a vowel"
            System.out.println("It's a vowel");
        } else {
            // If it doesn't match, print "It's not a vowel"
            System.out.println("It's not a vowel");
        }
    }
}