package top_SDET_JAVA_Programs_Kushal_Parikh_CODE_FULL.sdet_02_strings;

import java.util.HashMap;

public class SDET_04_Count_Occurrences_Of_Each_Character {
    //4.) Java program to count Occurrences of Each  Character in String
    public static void main(String[] args) {
        CharacterCount("Test Automation Java Automation");
    }

    static void CharacterCount(String inputString) {
        HashMap<String, Integer> charCountMap = new HashMap<>();
        for (String str : inputString.split(" ")) {
            if (charCountMap.containsKey(str)) {
                charCountMap.put(str, charCountMap.get(str) + 1);
            } else {
                charCountMap.put(str, 1);
            }
        }
        System.out.println("Count of Characters in a given string : " + charCountMap);
    }

}
