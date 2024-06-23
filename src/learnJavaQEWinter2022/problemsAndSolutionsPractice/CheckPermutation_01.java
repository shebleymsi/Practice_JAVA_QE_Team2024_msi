package learnJavaQEWinter2022.problemsAndSolutionsPractice;

public class CheckPermutation_01 { // read from here


    public static void main(String[] args) {

        checkOutPermutation("", "ABC");

    }

    public static void checkOutPermutation(String prefix, String st) {

        if (st.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < st.length(); i++) {
                String newWord = prefix + st.charAt(i);
                String newAlphabeticWord = st.substring(0, i) + st.substring(i + 1);
                checkOutPermutation(newWord, newAlphabeticWord);
            }
        }
    }
}
