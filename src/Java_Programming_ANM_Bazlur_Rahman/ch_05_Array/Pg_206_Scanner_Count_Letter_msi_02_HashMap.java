package Java_Programming_ANM_Bazlur_Rahman.ch_05_Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pg_206_Scanner_Count_Letter_msi_02_HashMap {
    //Write a Java program that takes letter inputs from the user and counts the occurrences of each letter.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the console
        System.out.print("Enter letters: "); // Prompt the user to enter letters
        String letters = input.nextLine(); // Read the input line from the console

        Map<Character, Integer> letterCount = new HashMap<>(); // Create a HashMap to store the count of each letter

        for (char ch : letters.toCharArray()) { // Loop through each character in the input string
            if (Character.isLetter(ch)) { // Check if the character is a letter
                ch = Character.toLowerCase(ch); // Convert the letter to lowercase to count case-insensitively
                letterCount.put(ch, letterCount.getOrDefault(ch, 0) + 1); // Update the count for the letter
            }
        }

        System.out.println("Letter Count:"); // Print the header for the output
        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) { // Loop through each entry in the map
            System.out.println(entry.getKey() + ": " + entry.getValue()); // Print the letter and its count
        }
    }
}


