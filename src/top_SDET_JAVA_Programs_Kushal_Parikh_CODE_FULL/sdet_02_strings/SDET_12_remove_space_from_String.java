package top_SDET_JAVA_Programs_Kushal_Parikh_CODE_FULL.sdet_02_strings;

import java.util.Scanner;

public class SDET_12_remove_space_from_String {
    //12.) Java program to remove space from a  given string
    //Enter a string with spaces: Welcome to Java World
    //String without spaces: WelcometoJavaWorld
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();
        String stringWithoutSpaces = removeSpaces(input);
        System.out.println("String without spaces: " + stringWithoutSpaces);
    }

    public static String removeSpaces(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

}
