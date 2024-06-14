package learnJavaQEWinter2022.RakibProblemsPractice.HashMap08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapScanner_01_01 {

    /*
    To create a program that takes user input to create a HashMap,
    we can use the Scanner class to read key-value pairs from the user.
    */
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create a new HashMap to store user input key-value pairs
        Map<String, String> userMap = new HashMap<>();

        // Prompt the user to enter key-value pairs for the map
        System.out.println("Enter key-value pairs for the map (type 'done' as key to finish): ");

        // Continuously read user input until the user types "done" as the key
        while (true) { // Code to be executed repeatedly as long as the condition is true
            // Prompt the user to enter a key
            System.out.print("Enter key: ");
            String key = scanner.nextLine();

            // Check if the user wants to finish input
            if (key.equalsIgnoreCase("done")) {
                break;  // Exit the loop if the user types "done"
            }

            // Prompt the user to enter a value
            System.out.print("Enter value: ");
            String value = scanner.nextLine();

            // Add the key-value pair to the HashMap
            userMap.put(key, value);
        }

        // Print the contents of the HashMap
        System.out.println("User Input Map: " + userMap);

        // Close the scanner to free up resources
        scanner.close();
    }

    /*
    Example:
    Enter key: country
    Enter value: USA
    Enter key: Done

    output:
    User Input Map: {country=USA}

    Key Note: While on chatGPT

    */
}
