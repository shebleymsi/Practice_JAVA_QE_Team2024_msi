package Java_Programming_ANM_Bazlur_Rahman.ch_05_Array;

import java.util.Scanner;

public class Pg_206_Scanner_Count_Letter_msi_01_Edit {
    //chatGPT:
    // Write a Java program that takes letter inputs from the user and counts the occurrences of each letter.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the console
        System.out.print("Enter letters: "); // Prompt the user to enter letters
        String letters = input.nextLine().toLowerCase(); // Read the input line from the console

        int[] letterCount = new int[26]; // Create an array to store the count of each letter (26 letters in the English alphabet)

        for (int i = 0; i < letters.length(); i++) { // Loop through each character in the input string
            char ch = letters.charAt(i); // Get the character at the current index
            if (Character.isLetter(ch)) { // Check if the character is a letter
                letterCount[ch - 'a'] = letterCount[ch - 'a'] + 1;
            }
        }

        System.out.println("Letter Count:"); // Print the header for the output
        for (int i = 0; i < letterCount.length; i++) { // Loop through the letter count array
            if (letterCount[i] > 0) { // Only print letters that have a count greater than 0
                System.out.println(((char) (i + 'a')) + ": " + letterCount[i]); // Print the letter and its count
            }
        }
    }
}
