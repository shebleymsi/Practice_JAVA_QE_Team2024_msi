package groupProblemsPractice_2024.group_01_StringProblems;

public class ReplaceCharacters05 { //done

        public static void main(String[] args) {
            String str = "Hello World!";
            String oldChar = "o";
            String newChar = "X";
            String result = replaceCharacters(str, oldChar, newChar);
            System.out.println("The string after replacing characters is: " + result );
        }

        public static String replaceCharacters(String str, String oldChar, String newChar) {
            return str.replace(oldChar, newChar);
        }
}
