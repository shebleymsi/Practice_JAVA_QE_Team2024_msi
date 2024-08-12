package top_QA_Stack_Junaid_Aziz;

public class Problem_05_ {
    //Question 5: Write a program to swap the two strings using substring.
    //The Input is: Hello world
    //Output should be: World Hello
    public static void main(String[] args) {
        String input = "Hello world";

        // Find the index of the space
        int spaceIndex = input.indexOf(" ");
        //System.out.println(spaceIndex);

        // Split the string into two parts using substring
        String firstPart = input.substring(0, spaceIndex);
        String secondPart = input.substring(spaceIndex + 1);

        // Swap the strings and concatenate them with a space in between
        String swapped = secondPart + " " + firstPart;

        // Print the result
        System.out.println("Output: " + swapped);
    }

}

