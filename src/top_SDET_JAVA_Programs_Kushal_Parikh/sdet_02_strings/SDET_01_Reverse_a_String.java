package top_SDET_JAVA_Programs_Kushal_Parikh.sdet_02_strings;

import java.util.Scanner;

public class SDET_01_Reverse_a_String {
    // Java program to reverse a string
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char ch;
        String newString = "";
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            newString = ch + newString;
        }
        System.out.println("Reversed String is : " + newString);

    }
}
