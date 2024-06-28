package rakibProblemsPractice.linkedList07;

import java.util.Arrays;
import java.util.LinkedList;

public class BasicLinkedList_01 {

    public static void main(String[] args) { // done

        //=========================================================================
        // Create a new LinkedList of Strings
        LinkedList<String> cars = new LinkedList<>();

        // Add elements to the LinkedList
        cars.add("Zeep");
        cars.add("Diarmaid");
        cars.add("Tesla");
        cars.add("Nissan");
        cars.add("Bugatti");
        // Print the LinkedList
        System.out.println("Initial LinkedList: " + cars); // Output: [Zeep, Diarmaid, Tesla, Nissan, Bugatti]

        //=========================================================================
        // Add an element at a specific position
        cars.add(2, "Ford");
        // Print the LinkedList
        System.out.println("After adding 'Ford' at index 2: " + cars); // Output: [Zeep, Diarmaid, Ford, Tesla, Nissan, Bugatti]
        /*
        cars.add(2, "Ford") adds the element "Ford" at index 2 in the LinkedList.
        This means it inserts "Ford" at the specified position, moving the elements after that position to the right.
         */

        //=========================================================================
        // Alternate way to add elements:**************
        // Create a LinkedList of Strings and initialize it with elements using Arrays.asList
        LinkedList<String> cars1 = new LinkedList<>(Arrays.asList("Zeep", "Diarmaid", "Tesla", "Nissan", "Bugatti"));
        // Print the contents of the LinkedList
        System.out.println("cars1: " + cars1); // Output: [Zeep, Diarmaid, Tesla, Nissan, Bugatti]

        //=========================================================================
        // Iterate through the LinkedList and print each element use for-each loop
        for (String car : cars) {
            System.out.println("Car: " + car);
        }

        //=========================================================================
        // Use index-based iteration to print each element use for loop
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car at index " + i + ": " + cars.get(i));
        }

        //=========================================================================
        // Add all elements from another collection
        LinkedList<String> moreCars = new LinkedList<>(Arrays.asList("Audi", "BMW", "Mercedes"));
        cars.addAll(moreCars);
        System.out.println("After adding more cars: " + cars); // Output: [Zeep, Diarmaid, Ford, Tesla, Nissan, Bugatti, Audi, BMW, Mercedes]

        //=========================================================================
        // Update the element at index 2 instance of "Ford"
        cars.set(2, "Toyota");
        // Print the updated LinkedList
        System.out.println("After updating index 2 to 'Toyota': " + cars); // Output: [Zeep, Diarmaid, Toyota, Tesla, Nissan, Bugatti, Audi, BMW, Mercedes]
        /*
        cars.set(2, "Toyota") replaces the element at index 2 with "Toyota" in the LinkedList.
         */

        //=========================================================================
        // Remove the element at index 0
        cars.remove(0);
        // Print the LinkedList after removal
        System.out.println("After removing element at index 0: " + cars); // Output: [Diarmaid, Toyota, Tesla, Nissan, Bugatti, Audi, BMW, Mercedes]

        //=========================================================================
        // Add an element to the beginning of the LinkedList
        cars.addFirst("Mazda");
        // Print the LinkedList
        System.out.println("After adding 'Mazda' to the beginning: " + cars); // Output: [Mazda, Diarmaid, Toyota, Tesla, Nissan, Bugatti, Audi, BMW, Mercedes]

        //=========================================================================
        // Add an element to the end of the LinkedList
        cars.addLast("Ferrari");
        // Print the LinkedList
        System.out.println("After adding 'Ferrari' to the end: " + cars); // Output: [Mazda, Diarmaid, Toyota, Tesla, Nissan, Bugatti, Audi, BMW, Mercedes, Ferrari]

        //=========================================================================
        // Remove the first element of the LinkedList
        cars.removeFirst();
        // Print the LinkedList
        System.out.println("After removing the first element: " + cars); // Output: [Diarmaid, Toyota, Tesla, Nissan, Bugatti, Audi, BMW, Mercedes, Ferrari]

        //=========================================================================
        // Remove the last element of the LinkedList
        cars.removeLast();
        // Print the LinkedList
        System.out.println("After removing the last element: " + cars); // Output: [Diarmaid, Toyota, Tesla, Nissan, Bugatti, Audi, BMW, Mercedes]

        //=========================================================================
        // Get and print the first element of the LinkedList
        System.out.println("First element: " + cars.getFirst()); // Output: Diarmaid
        System.out.println("First element use dynamic index : " + cars.get(0)); // Output: Diarmaid

        //=========================================================================
        // Get and print the last element of the LinkedList
        System.out.println("Last element use method: " + cars.getLast()); // Output: Mercedes
        System.out.println("Last element use dynamic index: " + cars.get(cars.size() - 1)); //// Output: Mercedes

        //=========================================================================
        // Check if the LinkedList is empty
        System.out.println("Is the LinkedList empty? " + cars.isEmpty()); // Output: false

        //=========================================================================
        // Get the size of the LinkedList
        System.out.println("Size of the LinkedList: " + cars.size()); // Output: 8

        //=========================================================================
        // Check if the LinkedList contains a specific element
        System.out.println("Does the LinkedList contain 'Toyota'? " + cars.contains("Toyota")); // Output: true

        //=========================================================================
        // Convert the LinkedList to an array
        Object[] carsArray = cars.toArray();
        System.out.println("LinkedList as array: " + Arrays.toString(carsArray)); // Output: [Diarmaid, Toyota, Tesla, Nissan, Bugatti, Audi, BMW, Mercedes]

        //=========================================================================
        // Clear all elements from the LinkedList
        cars.clear();
        // Print the LinkedList after clearing all elements
        System.out.println("After clearing all elements: " + cars); // Output: []

        /*
        The output [] indicates that the LinkedList cars is empty after clearing all elements.
        It's not a null LinkedList; it's an empty LinkedList.

        In Java, when you call the clear() method on a LinkedList,
        it removes all elements from the list, making it empty.
        It doesn't make the LinkedList null; it just removes all elements from it.
        So, when you print the LinkedList after clearing it,
        you get an empty set of square brackets [],
        indicating that the LinkedList contains no elements.
        */
    }

}
