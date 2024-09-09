package top_SDET_JAVA_Programs_Kushal_Parikh.sdet_02_strings;

import java.util.Scanner;

public class SDET_16_separated_Capital_small_character {
    //16.) Java program to gives two Output:  “abcde”, “ABCDE” for the Input  String Str = “aBACbcEDed”
    //Enter a string: aBACbcEDed
    //Output in lowercase: abced
    //Output in uppercase: ABCED
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Original String is: " + input);
        separateCharacters(input);
    }

    public static void separateCharacters(String input) {
        StringBuilder lowerCase = new StringBuilder();
        StringBuilder upperCase = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowerCase.append(ch);
            } else {
                upperCase.append(ch);
            }
        }
        System.out.println("Output in lowercase: " + lowerCase);
        System.out.println("Output in uppercase " + upperCase);
    }
}
