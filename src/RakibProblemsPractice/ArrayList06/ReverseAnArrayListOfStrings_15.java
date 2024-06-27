package RakibProblemsPractice.ArrayList06;

public class ReverseAnArrayListOfStrings_15 { //done
    /*
    The objective of this code is to demonstrate how to reverse the elements of an ArrayList of strings in Java
     using the Collections.reverse() method. The code initializes an ArrayList with some elements,
     prints the original order of elements, reverses the order, and then prints the reversed list.
     */
    public static void main(String[] args) {
        // Create an ArrayList of strings
        java.util.ArrayList<String> list = new java.util.ArrayList<>();

        // Add elements to the ArrayList
        list.add("apple");
        list.add("banana");
        list.add("orange");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + list);

        // Reverse the ArrayList using Collections.reverse() method
        java.util.Collections.reverse(list);

        // Print the reversed ArrayList
        System.out.println("Reversed ArrayList: " + list);
    }
}