package problems_midTermPractice_2022_2024_group_2025.practice_02_stringproblems;

import java.util.Scanner;

public class Palindrome_03_1 {
    /*
     *If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
     *Palindrome. So write java code to check if a given String is Palindrome or not.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check if it's a palindrome: ");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {

        str = str.replaceAll("\\s+", "").toLowerCase();
        //str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int leftIndex = 0;
        int rightIndex = str.length() - 1;

        while (leftIndex < rightIndex) {
            if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
                return false; // Not a palindrome if mismatch occurs
            }
            leftIndex++;
            rightIndex--;
        }
        return true; // Palindrome if the whole string was checked without mismatches
    }


}

