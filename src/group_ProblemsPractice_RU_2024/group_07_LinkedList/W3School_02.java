package group_ProblemsPractice_RU_2024.group_07_LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class W3School_02 {

    public static void main(String[] args) { //done

        //======================================================
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        //======================================================
        // Use addFirst() to add the item to the beginning
        cars.addFirst("Mazda");
        System.out.println(cars);

        //======================================================
        // Use addLast() to add the item to the end
        cars.addLast("Mazda");
        System.out.println(cars);

        //======================================================
        // Use removeFirst() remove the first item from the list
        cars.removeFirst();
        System.out.println(cars);

        //======================================================
        // Use removeLast() remove the last item from the list
        cars.removeLast();
        System.out.println(cars);

        //======================================================
        // remove from the index 2
        cars.remove(2);
        System.out.println(cars);

        //======================================================
        // Use getFirst() to display the first item in the list
        System.out.println(cars.getFirst());

        //======================================================
        // Use getLast() to display the last item in the list
        System.out.println(cars.getLast());

        //======================================================
        // apply contains() method
        System.out.println(cars.contains("Volvo"));

        //======================================================
        // apply size() method
        System.out.println(cars.size());


        //======================================================
        // sorted cars
        Collections.sort(cars);
        System.out.println("Sorted LinkedList: " + cars);

        //======================================================

        // original cars: ["Volvo", "BMW", "Ford", "Mazda"]
        // declare reverseCars LinkedList
        LinkedList<String> reverseCars = new LinkedList<>();
        //index-based reverse iteration
        for (int i = cars.size() - 1; i >= 0; i--) { // i = 0 or i > 0
            reverseCars.add(cars.get(i));
        }
        System.out.println("index-based reverse: " + reverseCars);

        // ChatGPT: Show me the iteration in Table format

        /*
        original cars: ["Volvo", "BMW", "Ford", "Mazda"]

        Iteration	i	cars.get(i)	reverseCars

        Initial	    3	    Mazda	    [Mazda]
        1st	        2	    Ford	    [Mazda, Ford]
        2nd	        1	    BMW	        [Mazda, Ford, BMW]
        3rd	        0	    Volvo	    [Mazda, Ford, BMW, Volvo]

         */

        //======================================================
        // Reverse the order of elements in the LinkedList
        Collections.reverse(cars);
        System.out.println("Reversed LinkedList: " + cars);


    }
}
