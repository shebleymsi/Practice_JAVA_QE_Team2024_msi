package group_ProblemsPractice_RU_2024.group_06_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseOrderSort_16 { //done

    /*
    🗒️ Objective
    The objective of the above code is to demonstrate:
    how to sort an ArrayList of integers in both ascending and descending order
    using the Collections.sort() method in Java.
    It initializes an ArrayList with some integer elements,
    sorts it in ascending order,
    and then sorts it in descending order using the Collections.reverseOrder() method.
     */

    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("element add before numbers Array: "+numbers);

        // Add integer elements to the ArrayList
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);
        System.out.println("element add after numbers Array: "+numbers);

        // Sort the ArrayList in ascending order using Collections.sort()
        Collections.sort(numbers);

        // Print the ArrayList after sorting in ascending order
        System.out.println("ArrayList after sorting in ascending order: " + numbers);

        // Sort the ArrayList in descending order using Collections.sort() with Collections.reverseOrder()
        Collections.sort(numbers, Collections.reverseOrder());

        // Print the ArrayList after sorting in descending order
        System.out.println("ArrayList after sorting in descending order: " + numbers);
    }
}
