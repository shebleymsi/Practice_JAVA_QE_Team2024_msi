package groupProblemsPractice_2024.group_06_ArrayList;

import java.util.ArrayList;

public class ContainsASpecificElement_05 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);

        System.out.println("Contains 5? " + numbers.contains(5)); // Should print true
    }
}


