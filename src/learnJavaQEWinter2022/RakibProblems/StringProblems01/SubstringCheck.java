package learnJavaQEWinter2022.RakibProblems.StringProblems01;

public class SubstringCheck {

        public static void main(String[] args) {
            String str = "Hello World!";
            String subStr = "World";
            System.out.println("The substring is present in the string: " + checkSubstring(str, subStr));
        }

        public static boolean checkSubstring(String str, String subStr) {
            return str.contains(subStr);
        }
}
