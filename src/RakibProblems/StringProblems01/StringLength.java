package RakibProblems.StringProblems01;

// Write a Java program to get the length of a given string.
//write the code by using a method and call it from the main method.

public class StringLength {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("The length of the string is: " + getLength(str));
    }

    public static int getLength(String str) {
        return str.length();
    }
}
