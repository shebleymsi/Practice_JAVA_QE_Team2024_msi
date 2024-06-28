package rakibProblemsPractice.stringProblems01;

public class SubString_07 {
    public static void main(String[] args) {

        String myStr = "Hello, World!";

        System.out.println(myStr.length());

        int endIndex = myStr.length()-1; // Calculate end index
        System.out.println(endIndex);

        String firstCharacter = myStr.substring(0, 1);
        System.out.println(firstCharacter);

        /*
        The substring(0, 1) call retrieves the substring starting at index 0 (inclusive) and ending at index 1 (exclusive),
        which corresponds to the first character “H” in the original string
         */
    }
}
