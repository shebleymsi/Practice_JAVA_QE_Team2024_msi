package problem_miscellaneous_msi_2024.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInitializationExample_Arrays_asList_with_new_HashSet {
    public static void main(String[] args) {
        // Declare and initialize a Set in one statement using Arrays.asList() with new HashSet<>()
        Set<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30));

        // Print the set
        System.out.println("Set: " + set);
    }
}
