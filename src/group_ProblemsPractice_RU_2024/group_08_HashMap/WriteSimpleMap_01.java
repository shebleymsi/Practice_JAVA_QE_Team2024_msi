package group_ProblemsPractice_RU_2024.group_08_HashMap;

import java.util.HashMap;
import java.util.Map;

public class WriteSimpleMap_01 {

    public static void main(String[] args) {
        // Objective: This program demonstrates how to create a HashMap,
        // add key-value pairs to it, merge another HashMap into it,
        // and print the contents of the HashMap.

        // Create a new HashMap to store key-value pairs
        Map<String, String> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("name", "John"); // Adding name
        map.put("age", "25");    // Adding age
        map.put("city", "New York"); // Adding city

        // Print the initial map
        System.out.println("Initial Map:" + map); // Expected output: {name=John, age=25, city=New York}

        // ==================================================================

        // Create another HashMap to store additional key-value pairs
        Map<String, String> existingMap = new HashMap<>();

        // Add key-value pairs to the map
        existingMap.put("country", "USA"); // Adding country
        existingMap.put("state", "NY");    // Adding state
        existingMap.put("Capital", "Albany");    // Adding state

        // Print the initial map
        System.out.println("Initial Map:" + existingMap);

        // ==================================================================
        // Merge the existingMap into the first map
        map.putAll(existingMap);
        // Print the final map after merging
        System.out.println("Final Map:" + map);
        // Expected output: {name=John, age=25, city=New York, country=USA, state=NY}
    }
}
