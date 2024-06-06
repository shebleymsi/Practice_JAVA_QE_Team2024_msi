package learnJavaQEWinter2022.RakibProblemsPractice.ArrayList06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class W3Schools_01 {

    public static void main(String[] args) {

        // Create an ArrayList object
        ArrayList<String> cars = new ArrayList<String>();

        // Add elements to the ArrayList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Print the ArrayList
        System.out.println(cars);

        // Access an Item - Print the first element
        System.out.println("1st car: " + cars.get(0));
        System.out.println("last cars: " + cars.get(cars.size() - 1));

        // Change an Item - Update the first element to "Opel"
        cars.set(0, "Opel");

        // Remove an Item - Remove the first element
        cars.remove(0);

        // Print the size of the ArrayList
        System.out.println("Size of the ArrayList: " + cars.size());

        // Loop Through the ArrayList using a for loop
        for (int i = 0; i < cars.size(); i++) {
            String carName = cars.get(i);
            System.out.println(carName);
        }

        System.out.println("********************* clear() ==> if want to run plz uncomment **************************");
        // Remove all elements in the ArrayList
        // cars.clear();
        System.out.println("After clear : " + cars);
        // Loop Through an ArrayList with the for-each Loop (will not print anything as the list is cleared)

        for (String i : cars) {
            System.out.println("After clear : " + i);
        }

        System.out.println("***********************************************");


        // Create an ArrayList that holds only integers
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(17);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(6);

        System.out.println(myNumbers);


        // Loop through the Integer ArrayList and print each element
        for (int j : myNumbers) {
            System.out.println(j);
        }

        // Loop through the Integer ArrayList and print each element
        for (int i = 0; i < myNumbers.size(); i++) {
            int number = myNumbers.get(i);
            System.out.println(number);

        }


        // Sort the cars ArrayList
        Collections.sort(cars); // for String Arraylist
        // print the Sorted  cars ArrayList
        for (String i : cars) {
            System.out.println(i);
        }


        // Sort the myNumbers ArrayList
        Collections.sort(myNumbers);

        // print the Sorted  cars ArrayList
        for (int i : myNumbers) {
            System.out.println(i);
        }

        // Reverse the sorted ArrayList
        Collections.reverse(myNumbers);

        // Print the reversed sorted ArrayList
        System.out.println("Reversed sorted ArrayList:");
        for (int i : myNumbers) {
            System.out.println(i);
        }


    }
}
