package QA_SDET_Interview_msi_2024.qa_Stack_Junaid_Aziz;

public class Problem_06_msi {
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

        // Create a new array and store the swapped values
        String[] output = new String[2];
        output[0] = parts[0];
        output[1] = parts[1];

        // Print the swapped array elements
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }

    }
}

