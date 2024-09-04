package top_SDET_JAVA_Programs_Tushar_Desai_TCS_SMART_CODE;

import java.util.HashMap;

public class TCS_37_MaxOccurringCharacter {
    //37. Find the Maximum Occurring Character in a String
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        char maxChar = str.charAt(0);
        int maxCount = 0;
        for (char c : charCount.keySet()) {
            if (charCount.get(c) > maxCount) {
                maxCount = charCount.get(c);
                maxChar = c;
            }
        }
        System.out.println(maxChar);
    }

}
