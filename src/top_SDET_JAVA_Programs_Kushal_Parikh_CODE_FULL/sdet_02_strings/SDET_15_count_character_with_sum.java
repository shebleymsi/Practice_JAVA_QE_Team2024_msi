package top_SDET_JAVA_Programs_Kushal_Parikh_CODE_FULL.sdet_02_strings;

import java.util.Scanner;

public class SDET_15_count_character_with_sum {
    //15.) Java program to gives Output: a2b2c3d2  for the Input String Str = “aabbcccdd”
    //Enter a string: aabbcccdd
    //Output: a2b2c3d2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String output = getCharacterCount(input);
        System.out.println("Output: " + output);
    }

    public static String getCharacterCount(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            // If the next character is the same, increase the count
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Append the character and its count to the result
                result.append(str.charAt(i)).append(count);
                count = 1; // Reset the count
            }
        }
        return result.toString();
    }

}
