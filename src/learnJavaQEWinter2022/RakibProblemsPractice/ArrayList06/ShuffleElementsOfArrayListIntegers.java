package learnJavaQEWinter2022.RakibProblemsPractice.ArrayList06;

public class ShuffleElementsOfArrayListIntegers {
    public static void main(String[] args) {

        // Create an ArrayList of integers
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + list);

        // Shuffle the ArrayList
        java.util.Collections.shuffle(list);

        // Print the shuffled ArrayList
        System.out.println("Shuffled ArrayList: " + list);
    }
}
