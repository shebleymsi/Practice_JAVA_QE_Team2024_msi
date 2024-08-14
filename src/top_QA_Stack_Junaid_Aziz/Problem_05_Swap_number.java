package top_QA_Stack_Junaid_Aziz;

public class Problem_05_Swap_number {
    //Question 8: Write a program to swap the two numbers using the substring method.
    //The Input is: 10 20
    //Output should be: 20 10
        public static void main(String[] args) {

            String input = "10 20";

            // Find the index of the space between the two numbers
            int spaceIndex = input.indexOf(" ");
            //System.out.println(spaceIndex); //2

            // Extract the first number using substring
            String firstNumber = input.substring(0, spaceIndex);

            // Extract the second number using substring
            String secondNumber = input.substring(spaceIndex + 1); //2(10)+1(" "). by default its goes to last index.

            // Swap the two numbers and concatenate them with a space in between
            String output = secondNumber + " " + firstNumber;

            // Output the result
            System.out.println(output);
        }
}
