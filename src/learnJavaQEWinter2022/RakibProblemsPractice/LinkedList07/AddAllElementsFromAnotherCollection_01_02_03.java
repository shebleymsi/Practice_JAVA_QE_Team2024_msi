package learnJavaQEWinter2022.RakibProblemsPractice.LinkedList07;

import java.util.Arrays;
import java.util.LinkedList;

public class AddAllElementsFromAnotherCollection_01_02_03 {
    public static void main(String[] args) {

        // Create a LinkedList of Strings and initialize it with elements using Arrays.asList
        LinkedList<String> cars1 = new LinkedList<>(Arrays.asList("Zeep", "Diarmaid", "Tesla", "Nissan", "Bugatti"));
        System.out.println("cars1: " + cars1); // Output: [Zeep, Diarmaid, Tesla, Nissan, Bugatti]

        // Add all elements from another collection
        LinkedList<String> moreCars = new LinkedList<>(Arrays.asList("Audi", "BMW", "Mercedes"));
        cars1.addAll(moreCars);

        System.out.println("After adding more cars: " + cars1);

    }
}
