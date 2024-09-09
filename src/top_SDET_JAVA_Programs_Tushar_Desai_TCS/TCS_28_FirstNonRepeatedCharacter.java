package top_SDET_JAVA_Programs_Tushar_Desai_TCS;

import java.util.LinkedHashMap;
import java.util.Map;

public class TCS_28_FirstNonRepeatedCharacter {
    //28. Find the First Non-Repeated Character in a String
    public static void main(String[] args) {
        String str = "swiss";
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }

}
