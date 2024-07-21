package problemsAndSolutionsPractice_2022_2024;

import java.util.Arrays;

public class CountSentence {

    public static void main(String[] args) {
        // Input string containing multiple sentences
        String str = "Eid Mubarak to Everyone. Hopefully everyone fine. Thank you all, guys. ok!";

        // Split the string based on periods (.)
        String[] sentences = str.split("[.!?]");
        // Print the array of sentences to verify the split
        System.out.println(Arrays.toString(sentences));

        System.out.println("1.========================================================");
        // Print the total number of elements in the array, including empty elements
        System.out.println("Number of sentences: " + sentences.length);

        System.out.println("2.chatGPT========================================================");
        // Count non-empty sentences by trimming each sentence and checking its length
        int count = 0;
        for (String sentence : sentences) {
            if (sentence.trim().length() > 0) {
                count = count + 1; // Increment count for non-empty sentences
            }
        }
        // Print the count of non-empty sentences
        System.out.println("Number of sentences (non-empty, trimmed): " + count);

        System.out.println("3.========================================================");
        // Count sentences by checking the trimmed length of each sentence
        int count1 = 0;
        for (String sentence : sentences) {
            if (sentence.trim().length() != 0) {
                count1 = count1 + 1; // Increment count for non-empty sentences
            }
        }
        // Print the count of sentences based on length check
        System.out.println("Number of sentences (non-empty, untrimmed): " + count1);

        System.out.println("4.========================================================");

        // Count sentences by checking the trimmed length of each sentence (another approach)
        int count2 = 0;
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].trim().length() != 0) {
                count2 = count2 + 1; // Increment count for non-empty sentences
            }
        }
        // Print the count of sentences based on length check (fixed logic)
        System.out.println("Number of sentences (non-empty, fixed logic): " + count2);
    }

}
