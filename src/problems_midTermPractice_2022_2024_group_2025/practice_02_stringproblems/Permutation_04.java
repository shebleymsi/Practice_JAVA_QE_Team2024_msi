package problems_midTermPractice_2022_2024_group_2025.practice_02_stringproblems;
public class Permutation_04 {
    public static void main(String[] args) {
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         */
        checkOutPermutation("", "ABC");
    }
    public static String checkOutPermutation(String prefix, String st) {
        if (st.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < st.length(); i++) {
                String newWord = prefix + st.charAt(i);
                String newAlphabeticWord = st.substring(0, i) + st.substring(i + 1);
                checkOutPermutation(newWord, newAlphabeticWord);
            }
        }
        return prefix;
    }

}

