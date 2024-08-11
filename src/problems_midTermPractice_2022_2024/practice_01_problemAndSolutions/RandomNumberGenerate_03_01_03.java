package problems_midTermPractice_2022_2024.practice_01_problemAndSolutions;

import java.util.*;

public class RandomNumberGenerate_03_01_03 {


    public static void main(String[] args) {
        // how to generate a list of random numbers,
        // eliminate duplicates,
        // and optionally sort the numbers using different types of collections in Java.

        Random random = new Random();

        List<Integer> getRandom = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            // Generate random integer range between 1 to 8 (inclusive)
            getRandom.add(random.nextInt(50) + 1);
        }
        System.out.print(getRandom+"\n");

        Set<Integer> getWithoutDuplicateRandom = new HashSet<>(getRandom);
        System.out.println("Without Duplicate Random: "+getWithoutDuplicateRandom);

        Set<Integer> getWithoutDuplicateRandomWithAutoSort = new TreeSet<>(getRandom);
        System.out.print("Without Duplicate Random With Auto-Sort: "+getWithoutDuplicateRandomWithAutoSort);

        // Note:
        // We cannot directly sort a Set because it does not maintain an order.
        // However, you can use a TreeSet which is a type of Set that maintains its elements in a sorted order.
    }

}
