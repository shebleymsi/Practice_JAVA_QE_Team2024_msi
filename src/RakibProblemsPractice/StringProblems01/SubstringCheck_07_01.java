package RakibProblemsPractice.StringProblems01;

public class SubstringCheck_07_01 { // done

    // is it checkSubstring(str, subStr) and contains() are same job?

        public static void main(String[] args) {
            String str = "Hello World!";
            String subStr = "World";
            boolean result = checkSubstring(str, subStr);
            System.out.println("The substring is present in the string: " + result);
        }

        public static boolean checkSubstring(String str, String subStr) {
            return str.contains(subStr);
        }
}
