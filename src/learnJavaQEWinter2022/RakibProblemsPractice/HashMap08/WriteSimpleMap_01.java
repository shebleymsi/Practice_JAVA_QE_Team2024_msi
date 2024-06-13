package learnJavaQEWinter2022.RakibProblemsPractice.HashMap08;

import java.util.HashMap;
import java.util.Map;

public class WriteSimpleMap_01 {

    public static void main(String[] args) {  // done
        // Create a new map
        Map<String, String> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("name", "John");
        map.put("age", "25");
        map.put("city", "New York");

        System.out.println("Initial Map:" + map);

        //Creating Another HashMap and Merging It:
        Map<String, String> existingMap = new HashMap<>();
        existingMap.put("country", "USA");
        existingMap.put("state", "NY");

        map.putAll(existingMap);

        System.out.println("Final Map:" + map);
    }
}
