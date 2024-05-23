package learnJavaQEWinter2022.RakibProblemsPractice.HashMap08;

import java.util.HashMap;
import java.util.Map;

public class WriteSimpleMap {

    public static void main(String[] args) {
        // Create a new map
        Map<String, String> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("name", "John");
        map.put("age", "25");
        map.put("city", "New York");

        // Print the map
        System.out.println("Map:");
        System.out.println(map);
    }
}
