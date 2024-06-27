package RakibProblems.ArrayList07;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseOrderSort {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);

        // Sort the ArrayList in ascending order and print it

        Collections.sort(numbers);

        System.out.println("ArrayList after sorting in ascending order: " + numbers);

        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println("ArrayList after sorting in descending order: " + numbers);
    }
}

