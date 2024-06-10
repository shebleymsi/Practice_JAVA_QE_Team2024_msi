package learnJavaQEWinter2022.RakibProblemsPractice.ArrayList06;

import java.util.ArrayList;

public class CharRemoveFromStringByMethod_19 {

    // Method to convert a string into an ArrayList of characters
    public static ArrayList<Character> convertStringToArrayList(String words) {
        ArrayList<Character> sentence = new ArrayList<>();
        // Iterate through each character of the string and add it to the ArrayList
        for (int i = 0; i < words.length(); i++) {
            sentence.add(words.charAt(i));
        }
        return sentence; // Return the populated ArrayList
    }


    // Method to remove the first occurrence of a specific character from an ArrayList
    public static ArrayList<Character> removeCharacter(ArrayList<Character> arr, char c) {
        int z = arr.indexOf(c); // Find the index of the character to be removed
        arr.remove(z); // Remove the character at the found index
        return arr; // Return the modified ArrayList
    }

    public static void main(String[] args) {
        // Initialize the string to be converted and manipulated
        String speech = "i am Shahadul Islam";
        // Print the original string
        System.out.println("1-------------------" + speech);

        // Convert the string to an ArrayList of characters
        ArrayList<Character> x = convertStringToArrayList(speech);
        // Print the converted ArrayList
        System.out.println("2x+++++++++++++++++++++" + x);

        // Remove the first occurrence of the space character ' ' from the ArrayList
        ArrayList<Character> y = removeCharacter(x, ' ');
        // Print the ArrayList after the first removal
        System.out.println("3y///////////////////////" + y);

        // Remove the next occurrence of the space character ' ' from the ArrayList
        ArrayList<Character> z = removeCharacter(x, ' ');
        // Print the ArrayList after the second removal
        System.out.println("4z......................." + z);

        // Remove the next occurrence of the space character ' ' from the ArrayList
        ArrayList<Character> p = removeCharacter(x, ' ');
        // Print the ArrayList after the third removal
        System.out.println("5p*******************" + p);

        // Remove the first occurrence of the character 'm' from the ArrayList
        System.out.println("===================" + removeCharacter(x, 'm'));
    }
}
