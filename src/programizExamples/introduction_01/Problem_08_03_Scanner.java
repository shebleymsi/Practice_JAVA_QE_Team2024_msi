package programizExamples.introduction_01;//package examples.introduction_01;

import java.util.Scanner;

public class Problem_08_03_Scanner {
    //Example 2: Check whether an alphabet is vowel or consonant using switch statement
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any vowel character: ");
        char input = scanner.next().toLowerCase().charAt(0);

        switch (input) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(input + " is a vowel");
                break;
            default:
                System.out.println(input + " is a consonant");
        }
    }
}
