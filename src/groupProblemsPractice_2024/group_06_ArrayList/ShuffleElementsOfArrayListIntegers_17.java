package groupProblemsPractice_2024.group_06_ArrayList;

public class ShuffleElementsOfArrayListIntegers_17 {

    /*
    🗒️ Objective:
    The objective of the above code is to demonstrate:
     how to shuffle the elements of an ArrayList of integers in Java using the Collections.shuffle() method.
     It creates an ArrayList with integer elements, shuffles the list to randomize the order of the elements,
     and then prints both the original and shuffled lists.
     */
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
        // Prints the elements of the ArrayList after shuffling to show the new, randomized order.
        System.out.println("Shuffled ArrayList: " + list);
    }
}
