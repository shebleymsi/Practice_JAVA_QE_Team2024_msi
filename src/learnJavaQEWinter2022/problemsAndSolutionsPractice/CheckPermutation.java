package learnJavaQEWinter2022.problemsAndSolutionsPractice;

public class CheckPermutation { //PermutationGenerator
    public static void main(String[] args) {

        getPermutationGenerator("", "ABC");

    }

    public static void getPermutationGenerator(String prefix, String str) {

        if (str.length() == 0) {
            System.out.println(prefix);
        }

        for (int i = 0; i < str.length(); i++) {

            String newWord = prefix + str.charAt(i);

            String newAlphabeticWord = str.substring(0, i) + str.substring(i + 1);

            getPermutationGenerator(newWord, newAlphabeticWord);

        }

    }

}
