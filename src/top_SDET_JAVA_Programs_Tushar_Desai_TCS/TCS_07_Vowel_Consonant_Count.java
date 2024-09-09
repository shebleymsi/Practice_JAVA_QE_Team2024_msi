package top_SDET_JAVA_Programs_Tushar_Desai_TCS;

public class TCS_07_Vowel_Consonant_Count {
    public static void main(String[] args) {
        String str = "Automation";
        int vowels = 0, consonants = 0;
        for (char c : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);  }

}
