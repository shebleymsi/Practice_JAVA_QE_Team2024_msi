package top_programizExamplesPractice_2024_running.examples_01_Introduction;

public class Problem_014 {
    // Example 1: Check if String is Empty or Null
    public static void main(String[] args) {
        // create null, empty, and regular strings
        String str1 = null;  // str1 is assigned null
        String str2 = "";    // str2 is assigned an empty string
        String str3 = "  ";  // str3 is assigned a string with spaces

        // check if str1 is null or empty
        System.out.println("str1 is " + isNullEmpty(str1));  // call method isNullEmpty with str1

        // check if str2 is null or empty
        System.out.println("str2 is " + isNullEmpty(str2));  // call method isNullEmpty with str2

        // check if str3 is null or empty
        System.out.println("str3 is " + isNullEmpty(str3));  // call method isNullEmpty with str3
    }

    // method to check if string is null or empty
    public static String isNullEmpty(String str) {
        // check if string is null
        if (str == null) {
            return "NULL";  // return "NULL" if the string is null
        }
        // check if string is empty
        else if (str.trim().isEmpty()) {
            return "EMPTY";  // return "EMPTY" if the string is empty
        }
        else {
            return "neither NULL nor EMPTY";  // return this if the string is neither null nor empty
        }
    }
}
