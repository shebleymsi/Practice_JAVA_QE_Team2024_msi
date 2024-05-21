package learnJavaQEWinter2022.RakibProblemsPractice.ArrayList07;

public class ReverseAnArrayListOfStrings {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + list);

        // Reverse the ArrayList
        java.util.Collections.reverse(list);

        // Print the reversed ArrayList
        System.out.println("Reversed ArrayList: " + list);
    }
}
