package top_SDET_JAVA_Programs_Kushal_Parikh_CODE_FULL.sdet_02_strings;

import java.util.HashMap;
import java.util.Set;

public class SDET_03_Count_Duplicate_characters {
    //3.) Java program to find duplicate characters in a  string
    public static void main(String[] args) {
        duplicateCharacterCount("Learn Java Programming");
    }

    static void duplicateCharacterCount(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        Set<Character> charsInString = charCountMap.keySet();
        System.out.println("Duplicate Characters in : " + inputString);
        for (Character ch : charsInString) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + " : " + charCountMap.get(ch));
            }
        }
    }

}
