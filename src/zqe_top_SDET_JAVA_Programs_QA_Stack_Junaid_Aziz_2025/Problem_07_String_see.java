package zqe_top_SDET_JAVA_Programs_QA_Stack_Junaid_Aziz_2025;

public class Problem_07_String_see {
    //Question 7: Write a program to swap the two strings using StringBuilder class.
    //The Input is: Hello world
    //Output should be: World Hello
    public static void main(String[] args) {

        String input = "Hello world";

        // Split the input string into two parts based on the space
        String[] parts = input.split(" ");
        //System.out.println(Arrays.toString(parts)); //[Hello, world]

        // Use StringBuilder to swap the two strings
        StringBuilder sb = new StringBuilder();
        sb.append(parts[1]).append(" ").append(parts[0]); // Append the second word (world). Append the space. Append the first word (Hello)
        //sb.append(parts[0]).append(" ").append(parts[1]);

        // Output the result
        System.out.println(sb.toString());
    }

}
