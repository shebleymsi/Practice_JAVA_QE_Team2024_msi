package top_SDET_JAVA_Programs_QA_Stack_Junaid_Aziz;

public class Problem_05_Swap_String {
    //Question 5: Write a program to swap the two strings using substring.
    //The Input is: Hello world
    //Output should be: World Hello
    public static void main(String[] args) {
        String input = "Hello world"; //Hello world now

        // Find the index of the space
        int spaceIndex = input.indexOf(" ");
        //System.out.println(spaceIndex); // 5

        // Split the string into two parts using substring
        // Extract the first string word using substring
        String firstPart = input.substring(0, spaceIndex);

        // Extract the second String word using substring
        String secondPart = input.substring(spaceIndex + 1); //5(Hello)+1(" "). by default its goes to last index.

        // Swap the strings and concatenate them with a space in between
        String swapped = secondPart + " " + firstPart;

        // Print the result
        System.out.println("Output: " + swapped);
    }

}

