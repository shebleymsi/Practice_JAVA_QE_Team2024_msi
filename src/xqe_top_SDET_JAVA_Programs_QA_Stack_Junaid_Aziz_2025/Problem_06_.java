package xqe_top_SDET_JAVA_Programs_QA_Stack_Junaid_Aziz_2025;

public class Problem_06_ {
    //Question 6: Write a program to swap the two strings using temp variable.
    //The Input is: Hello world
    //Output should be: World Hello
    public static void main(String[] args) {
        String input = "Hello world";
        // Split the input string into two parts based on the space
        String[] parts = input.split(" ");
        //System.out.println(Arrays.toString(parts));

        // Use a temporary variable to swap the two strings
        String temp = parts[0];
        parts[0] = parts[1];
        parts[1] = temp;

        // Combine the swapped strings
        String output = parts[0] + " " + parts[1];

        // Print the result
        System.out.println("Output: " + output);
    }

    }

