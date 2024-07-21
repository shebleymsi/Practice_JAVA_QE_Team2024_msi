package GroupProblemsPractice_2024.group_06_ArrayList;
import java.util.ArrayList;

public class EmptyOrNot_04 { //done

    public static void main(String[] args) {
        // Creating an ArrayList to store characters
        ArrayList<Character> letters = new ArrayList<>();

        // Printing whether the ArrayList is empty or not (should print true as it's initially empty)
        System.out.println("Is ArrayList empty? " + letters.isEmpty()); // Should print true

        // Adding a character to the ArrayList
        letters.add('A');

        // Printing whether the ArrayList is empty or not after adding a character (should print false)
        System.out.println("Is ArrayList empty? " + letters.isEmpty()); // Should print false
    }
}