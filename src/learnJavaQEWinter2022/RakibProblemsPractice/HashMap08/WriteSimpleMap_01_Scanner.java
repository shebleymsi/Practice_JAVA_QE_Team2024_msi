package learnJavaQEWinter2022.RakibProblemsPractice.HashMap08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WriteSimpleMap_01_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> userMap = new HashMap<>();

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
        System.out.println("User Input Map: " + userMap);
        scanner.close();
    }
}
