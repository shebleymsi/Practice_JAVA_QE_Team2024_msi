package learnJavaQEWinter2022.RakibProblemsPractice.StringProblems01;

// Write a Java program to get the length of a given string.
// write the code by using a method and call it from the main method.

public class StringLength02 { // done

    public static void main(String[] args) {
        String str = "Hello World!";
        int result = getLength(str);
        System.out.println("The length of the string is: " + result);
    }

    public static int getLength(String str) {
        return str.length();
    }
}
