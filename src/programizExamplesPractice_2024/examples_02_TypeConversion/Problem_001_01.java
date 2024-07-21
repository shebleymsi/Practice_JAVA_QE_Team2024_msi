package programizExamplesPractice_2024.examples_02_TypeConversion;

public class Problem_001_01 {
    // Example 2: Convert char array to String
    // char[] ch = {'a', 'e', 'i', 'o', 'u'};
    // Expected output: aeiou

    public static void main(String[] args) {
        // Step 1: Initialize a character array with vowels
        char[] ch = {'a', 'e', 'i', 'o', 'u'};

        // Step 2: Convert the char array to a String using String.valueOf() method
        String st = String.valueOf(ch);
        // Step 3: Print the resulting String
        System.out.println(st);

        // Step 4: Convert the char array to a String using the String constructor
        String st2 = new String(ch);
        // Step 5: Print the resulting String
        System.out.println(st2);
    }
}
