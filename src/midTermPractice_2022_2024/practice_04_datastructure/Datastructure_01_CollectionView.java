package midTermPractice_2022_2024.practice_04_datastructure;

import java.util.Collection;
import java.util.HashMap;

public class Datastructure_01_CollectionView {
        /*
         Map is created and inserted some data.
         Retrieve the Collection view of values present in map
        */
        public static void main(String[] args) {
                // Creating a HashMap
                HashMap<String, Integer> map = new HashMap<>();

                // Inserting data into the map
                map.put("Alice", 30);
                map.put("Bob", 25);
                map.put("Charlie", 35);
                map.put("David", 40);

                System.out.println(map);

                // Retrieving the collection view of values present in the map
                Collection<Integer> values = map.values();

                // Printing the values
                System.out.println("Values in the map: " + values);
        }
}
