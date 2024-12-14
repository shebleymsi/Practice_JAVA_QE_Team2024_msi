package XQE_JavaMathNotebook;

public class QE08_CheckPermutation {

    public static void main(String[] args) {
        String str = "ABC"; // Input string
        generatePermutations("", str);
    }

    // Method to generate all permutations of a string
    public static void generatePermutations(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix); // Print the complete permutation
        } else {
            for (int i = 0; i < n; i++) {
                // Recursive call with updated prefix and remaining string
                generatePermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
            }
        }
    }
}

//use recursion
