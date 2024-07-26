package QA_InterviewCode_2021_2024.string;

import java.util.HashMap;
public class SubString {
    public static void main(String[] args) {
    String str ="abcdefabab";
    char[]arr = str.toCharArray();
    String subString= null;
    int subStringLength=0;
    HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (!map.containsKey(c)) {
                map.put(c, i);
            } else {
                i = map.get(c);
                map.clear();
            }
    if (map.size()> subStringLength){
        subStringLength=map.size();
        subString=map.keySet().toString();
    }}
        System.out.println("input : "+ str);
        System.out.println("subString : "+ subString);
        System.out.println("subStringLength  : "+ subStringLength);
}}
//===================================================
/*public static void main(String[] args) {
    // find the longest longestSubString without repeating characters.
    String str = "what is the long substring";
    longestSubString(str);
    longestSubString("abcdefabab");
    String st = "abcabcdbadefacdgh";
    System.out.println("================================");
    longestSubString(st);
    System.out.println("===================");

    public static void  longestSubString(String str){
        char[] charArray = str.toCharArray();
        char c;
        int lengthSS = 0;
        String subString = null;
        String name = "waqas";
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            c = charArray[i];
            if (!hm.containsKey(c)) {
                hm.put(c, i);
            } else {
                i = hm.get(c);
                hm.clear();
            }
            if (hm.size() > lengthSS) {
                lengthSS = hm.size();
                subString = hm.keySet().toString();
            }}
        System.out.println("The original string is " + str);
        System.out.println("==================");

        System.out.println("The longes longestlongestSubString without repetitions is " + subString);
    }}*/