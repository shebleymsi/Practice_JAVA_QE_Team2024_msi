package w3_JAVA.java_How_To;

public class How_To_2_Count_Number_of_Words_in_a_String {
    public static void main(String[] args) {
        String words = "One two three four";
        int countWords = words.split("\\s").length;
        System.out.println(countWords);
    }

}
