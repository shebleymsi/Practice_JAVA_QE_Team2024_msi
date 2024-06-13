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
        Scanner scanner = new Scanner(System.in);
        Map<String, String> userMap = new HashMap<>();

        // Add key-value pairs to the map from user input
        System.out.println("Enter key-value pairs for the map (type 'done' as key to finish): ");

        while (true) {
            System.out.print("Enter key: ");
            String key = scanner.nextLine();
            if (key.equalsIgnoreCase("done")) {
                break;
            }
            System.out.print("Enter value: ");
            String value = scanner.nextLine();
            userMap.put(key, value);
        }

        // Print the map
        System.out.println("User Input Map: " + userMap);

        // Close the scanner
        scanner.close();
    }

    /*

    Example:
    Enter key: country
    Enter value: USA
    Enter key: done

    output:
    User Input Map: {country=USA}

     */
}

