package learnJavaQEWinter2022.RakibProblemsPractice.LinkedList07;
import java.util.Collections;
import java.util.LinkedList;
public class W3School {

        public static void main(String[] args) {
            LinkedList<String> cars = new LinkedList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            System.out.println(cars);

            // Use addFirst() to add the item to the beginning
            cars.addFirst("Mazda");
            System.out.println(cars);

            // Use addLast() to add the item to the end
            cars.addLast("Mazda");
            System.out.println(cars);

            // Use removeFirst() remove the first item from the list
            cars.removeFirst();
            System.out.println(cars);

            // Use removeLast() remove the last item from the list
            cars.removeLast();
            System.out.println(cars);

            // remove from the index 2
            cars.remove(2);
            System.out.println(cars);

            // Use getFirst() to display the first item in the list
            System.out.println(cars.getFirst());

            // Use getLast() to display the last item in the list
            System.out.println(cars.getLast());

            // apply contains() method
            System.out.println(cars.contains("Volvo"));

            // apply size() method
            System.out.println(cars.size());

            //apply reverse method on cars
            LinkedList<String> reverseCars = new LinkedList<>();
            for (int i = cars.size() - 1; i >= 0; i--) {
                reverseCars.add(cars.get(i));
            }

            Collections.reverse(cars);
            System.out.println(cars);


        }
    }
