package programizExamplesPractice_2024_RUNNING.examples_01_Introduction;

public class Problem_12_regex {
    //Example 1: Program to Remove All Whitespaces
    public static void main(String[] args) {
        String sentence = "T    his is b  ett     er.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }


}

