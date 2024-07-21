package programizExamplesPractice_2024.examples_02_TypeConversion;

import java.util.Arrays;

public class Problem_001_02 {
    // Example 3: Convert String to char array
    // Input: "This is great"
    // Expected output: [T, h, i, s,  , i, s,  , g, r, e, a, t]

    public static void main(String[] args) {
        // Step 1: Initialize a string with the value "This is great"
        String st = "This is great";

        // Step 2: Convert the string to a character array using toCharArray() method
        char[] chars = st.toCharArray();

        // Step 3: Print the resulting character array using Arrays.toString() to format the output
        System.out.println(Arrays.toString(chars));
    }
}
