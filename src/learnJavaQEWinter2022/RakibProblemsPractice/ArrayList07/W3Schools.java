package learnJavaQEWinter2022.RakibProblemsPractice.ArrayList07;

import java.util.ArrayList;
import java.util.Collections;

public class W3Schools {


    public static void main(String[] args) {

        // Create an ArrayList object
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");


        // Print the ArrayList
        System.out.println(cars);

        // Access an Item

        System.out.println(cars.get(0));

        // Change an Item

        cars.set(0, "Opel");

        // Remove an Item

        cars.remove(0);


        // To find out how many elements an ArrayList have, use the size method:

        cars.size();

        // Loop Through an ArrayList

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // To remove all elements in the ArrayList, use the clear() method:

        cars.clear();


        // Loop Through an ArrayList with the for-each Loop

        for (String i : cars) {
            System.out.println(i);
        }

        // Create an ArrayList that holds only integers:
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int j : myNumbers) {
            System.out.println(j);
        }

        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }

        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }

    }

}
