package top_SDET_JAVA_Programs_Kushal_Parikh_CODE_FULL.sdet_02_strings;

import java.util.HashSet;

public class SDET_20_longest_without_repeating_characters {
    // 20.) Java program to find the longest substring without repeating characters

    public static void main(String[] args) {
        String s1 = "abcabcbb"; // Expected: "abc", length 3
        String s2 = "bbbbb"; // Expected: "b", length 1
        String s3 = "pwwkew"; // Expected: "wke", length 3
        String s4 = ""; // Expected: "", length 0
        String s5 = " "; // Expected: " ", length 1 // MSI

        System.out.println("Longest substring without repeating characters in s1: " + lengthOfLongestSubstring(s1)); // Output: 3
        System.out.println("Longest substring without repeating characters in s2: " + lengthOfLongestSubstring(s2)); // Output: 1
        System.out.println("Longest substring without repeating characters in s3: " + lengthOfLongestSubstring(s3)); // Output: 3
        System.out.println("Longest substring without repeating characters in s4: " + lengthOfLongestSubstring(s4)); // Output: 0
        System.out.println("Longest substring without repeating characters in s5: " + lengthOfLongestSubstring(s5)); // Output: 1
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int start = 0;
        int end = 0;

        while (end < s.length()) {
            char currentChar = s.charAt(end);
            if (!set.contains(currentChar)) {
                set.add(currentChar);
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}
