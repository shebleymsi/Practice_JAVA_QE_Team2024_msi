package top_programizExamplesPractice_2024_running.examples_01_Introduction;

public class Problem_014_01 {
    //Example 2: Check if String with spaces is Empty or Null
    public static void main(String[] args) {

        // create a string with white spaces
        String str = "    ";

        // check if str1 is null or empty
        System.out.println("str is " + isNullEmpty(str));
    }

    // method check if string is null or empty
    public static String isNullEmpty(String str) {

        // check if string is null
        if (str == null) {
            return "NULL";
        }

        // check if string is empty
        else if (str.trim().isEmpty()) {
            return "EMPTY";
        } else {
            return "neither NULL nor EMPTY";
        }
    }
}
