package java_Programming_ANM_Bazlur_Rahman_2024__RUNNING.ch_05_Array;

import java.util.Scanner;

public class Pg_206_Scanner_Count_Letter {
    // ANM_Bazlur_Rahman:
    // Write a Java program that takes letter inputs from the user and counts the occurrences of each letter.
    // Enter Characters: We love NewYork.
    // Java_Programming_ANM_Bazlur_Rahman: pg 206 to pg210

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Characters: ");
        String inputValue = input.nextLine().toLowerCase();
        //System.out.println(inputValue);
        //we love newyork.
        //System.out.println("letters length: " + letters.length);
        //letters length: 16

        char[] letters = inputValue.toCharArray();
        //char[] letters = input.nextLine().toLowerCase().toCharArray(); // row 14 and row 20 merge in this row 21
        //System.out.println("In letters array the letters in the input are: " + Arrays.toString(letters));
        //The letters in the input are: [w, e,  , l, o, v, e,  , n, e, w, y, o, r, k, .]

        int[] counts = new int[26];
        //System.out.println("In counts array the letters in the input are (before): "+ Arrays.toString(counts));
        //The letters in the input are: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i < letters.length; i++) {
            char letter = letters[i];
            if (Character.isLetter(letter)) {
                int index = letter - 'a';
                counts[index] = counts[index] + 1;
            }
        }
        //System.out.println("In counts array the letters in the input are (after): " + Arrays.toString(counts));
        //In counts array the letters in the input are (after): [0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 1, 1, 0, 1, 2, 0, 0, 1, 0, 0, 0, 1, 2, 0, 1, 0]

        System.out.println("Letter counts: ");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                char letter = (char) (i + 'a');
                System.out.println(letter + ": " + counts[i]);
            }
            /*
            Letter counts:
            e: 3
            k: 1
            l: 1
            n: 1
            o: 2
            r: 1
            v: 1
            w: 2
            y: 1
            */
        }
    }
}


