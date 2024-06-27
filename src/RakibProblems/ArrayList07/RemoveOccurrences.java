package RakibProblems.ArrayList07;

import java.util.ArrayList;


// Remove all occurrences of a specific element from an ArrayList of integers.
//java.util.Collections.singleton() method is used to return an immutable set containing only the specified object.
public class RemoveOccurrences {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(2);

        numbers.removeAll(java.util.Collections.singleton(2));

        System.out.println("ArrayList after removing all occurrences of 2: " + numbers);
    }

}



