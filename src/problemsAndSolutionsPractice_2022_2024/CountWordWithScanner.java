package problemsAndSolutionsPractice_2022_2024;

import java.util.Arrays;
import java.util.Scanner;

public class CountWordWithScanner {

    public static void main(String[] args) {

        getCountOfTheWordsWithScanner();
    }

    public static void getCountOfTheWordsWithScanner() { // Shebley
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String str = input.nextLine();

        // Split the string based on spaces
        String[] words = str.split(" ");

        // Print the array of words to verify the split
        System.out.println(Arrays.toString(words));

        // Print the total number of elements in the array
        System.out.println("1.====================================================================");
        System.out.println("Total number of elements in the array: " + words.length);

        // Count non-empty words by trimming each word and checking its length
        System.out.println("2.====================================================================");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].trim().length() != 0) {
                count = count + 1; // Increment count for non-empty words
            }
        }
        // Print the count of non-empty words
        System.out.println("Number of words in String (using for loop with index): " + count);

        // Count non-empty words by trimming each word and checking its length (using enhanced for loop)
        System.out.println("3.====================================================================");
        int count1 = 0;
        for (String word : words) {
            if (word.trim().length() != 0) {
                count1 = count1 + 1; // Increment count for non-empty words
            }
        }
        // Print the count of non-empty words
        System.out.println("Number of words in String (using enhanced for loop): " + count1);
    }

}

