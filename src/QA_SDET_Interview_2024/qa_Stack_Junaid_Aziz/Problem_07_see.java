package QA_SDET_Interview_2024.qa_Stack_Junaid_Aziz;

import java.util.Arrays;

public class Problem_07_see {
    //Question 7: Write a program to swap the two strings using StringBuilder class.
    //The Input is: Hello world
    //Output should be: World Hello
    public static void main(String[] args) {

        String input = "Hello world";

        // Split the input string into two parts based on the space
        String[] parts = input.split(" ");
        System.out.println(Arrays.toString(parts));

        // Use StringBuilder to swap the two strings
        StringBuilder sb = new StringBuilder();
        sb.append(parts[1]) // Append the second word (world)
                .append(" ")     // Append the space
                .append(parts[0]); // Append the first word (Hello)

        // Output the result
        System.out.println(sb.toString());
    }
}
