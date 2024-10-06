package top_SDET_JAVA_Programs_Kushal_Parikh_IMPORTANT.sdet_02_strings;

import java.util.Scanner;

public class SDET_10_Print_unique_characters {
    //10.) Java program to print unique characters
    //Enter a string: Java Automation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Unique characters in \"" + input + "\":");
        printUniqueCharacters(input);
    }

    public static void printUniqueCharacters(String str) {  // Assume ASCII characters (0-127), use boolean array to track  character occurrences
        boolean[] unique = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!unique[ch]) {
                unique[ch] = true;
                System.out.print(ch + " ");
            }
        }

    }

}
