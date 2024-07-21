package groupProblemsPractice_2024.group_07_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class ConvertTheLinkedListToAnArray_01_02 {
    public static void main(String[] args) {

        // Create a LinkedList of Strings and initialize it with elements using Arrays.asList
        LinkedList<String> cars1 = new LinkedList<>(Arrays.asList("Zeep", "Diarmaid", "Tesla", "Nissan", "Bugatti"));
        System.out.println("cars1: " + cars1); // Output: [Zeep, Diarmaid, Tesla, Nissan, Bugatti]

        // Convert the LinkedList to an array
        Object[] carsArray = cars1.toArray();
        //String[] carsArray = cars1.toArray(new String[0]);
        //String[] carsArray = cars1.toArray(new String[cars1.size()]);
        System.out.println("LinkedList as array: " + Arrays.toString(carsArray)); // Output: [Zeep, Diarmaid, Tesla, Nissan, Bugatti]

        /*
        Why we use Object[] ? -->
        In Java, when you convert a LinkedList to an array using the toArray() method without specifying a type argument,
        it returns an array of type Object[]. This is because toArray() method in LinkedList returns an array of type Object.

        The reason for this is historical compatibility. Prior to Java 5, generics were not available in the language.
        So, the toArray() method didn't have the capability to return an array of the specific type of elements contained
        in the LinkedList. Instead, it returns an array of type Object[], which can hold any type of object.

        If you want the resulting array to have a specific type (e.g., String[] in this case),
        you can pass an array of the desired type as an argument to the toArray() method:

        String[] carsArray = cars1.toArray(new String[cars1.size()]);

        This way, you'll get an array of type String[],
        which is more type-safe and convenient to work with if you know the type of elements in your LinkedList.
         */

    }

}
