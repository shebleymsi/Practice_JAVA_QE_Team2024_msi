package programizExamplesPractice.Examples_01_introduction;

public class Problem_11_Next_important {
    // Example: Find Frequency of a Character

    // Objective:
    // The objective of the code is to find and print:
    // the frequency (number of occurrences) of a specific character (ch) in a given string (str).

    public static void main(String[] args) {
        // Initialize the string in which we will find the frequency of the character
        String str = "This website is awesome.";

        // The character whose frequency we want to find
        char ch = 'e';

        // Variable to store the frequency count
        int frequency = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character matches the character 'ch'
            if (ch == str.charAt(i)) {
                // If it matches, increment the frequency counter

                ++frequency;

            }
        }

        // Print the result
        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}
