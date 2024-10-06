package top_SDET_JAVA_Programs_Kushal_Parikh_IMPORTANT.sdet_02_strings;

public class SDET_02_reverse_each_word {
    //2.) Java program to reverse each word of a given  string
    public static void main(String[] args) {
        reverseEachWordOfString("Java is good programming languages");
    }

    static void reverseEachWordOfString(String inputString) {
        String[] words = inputString.split(" ");
        String reverseString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String newString = "";
            char ch;
            for (int j = 0; j < word.length(); j++) {
                ch = word.charAt(j);
                newString = ch + newString;
            }
            reverseString = reverseString + newString + " ";
        }
        System.out.println(inputString);
        System.out.println(reverseString);
    }

}
