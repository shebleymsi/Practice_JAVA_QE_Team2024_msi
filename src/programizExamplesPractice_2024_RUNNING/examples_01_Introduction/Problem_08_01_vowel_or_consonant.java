package programizExamplesPractice_2024_RUNNING.examples_01_Introduction;

import java.util.Scanner;

public class Problem_08_01_vowel_or_consonant {
    // Example 1: Check whether an alphabet is vowel or consonant using if..else statement
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any vowel character: ");
        char input = scanner.next().toLowerCase().charAt(0);

        if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u')  {
            System.out.println("User input is vowel");
            
        }else {
            System.out.println("user input is consonant");
        }

    }
}
