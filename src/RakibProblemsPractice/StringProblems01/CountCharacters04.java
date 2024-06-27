package RakibProblemsPractice.StringProblems01;

public class CountCharacters04 { // done

    public static void main(String[] args) {
        String str = "Hello World!";
        int result = countCharacters(str);
        System.out.println("The number of characters in the string is: " + result);
    }

    public static int countCharacters(String str) {
        return str.length();
    }
}
