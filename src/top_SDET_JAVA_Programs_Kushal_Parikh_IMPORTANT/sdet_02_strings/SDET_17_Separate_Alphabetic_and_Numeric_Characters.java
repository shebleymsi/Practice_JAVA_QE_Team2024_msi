package top_SDET_JAVA_Programs_Kushal_Parikh_IMPORTANT.sdet_02_strings;

import java.util.Scanner;

public class SDET_17_Separate_Alphabetic_and_Numeric_Characters {
    //17.) Java program to gives two Output:  “Subburaj”, “123” for the Input  String Str = “Subbu123raj”
    //Enter a string: Subbu123raj
    //Output in lowercase: Subburaj
    //Output in uppercase: 123
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Original String is: " + input);
        separateAlphaAndNumeric(input);
    }

    public static void separateAlphaAndNumeric(String input) {
        StringBuilder alphaPart = new StringBuilder();
        StringBuilder numericPart = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphaPart.append(ch);
            } else if (Character.isDigit(ch)) {
                numericPart.append(ch);
            }
        }
        System.out.println("Output in Alpha: " + alphaPart.toString());
        System.out.println("Output in Numeric: " + numericPart.toString());
    }
}


