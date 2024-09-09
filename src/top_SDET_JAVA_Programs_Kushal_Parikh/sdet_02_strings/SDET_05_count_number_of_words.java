package top_SDET_JAVA_Programs_Kushal_Parikh.sdet_02_strings;

import java.util.Scanner;

public class SDET_05_count_number_of_words {
    //5.) Java program to count the number of words in  a string
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println("Number of words in a string: " + count);
    }
}
