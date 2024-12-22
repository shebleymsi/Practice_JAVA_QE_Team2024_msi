package XQE_JavaMathNotebook_2025.xqe_problemsAndSolutions_msi;

public class QE19_ReverseString_EndToBeginning {
    public static void main(String[] args) {

        String name = "James";
        String reversedName = reverseString1(name);
        System.out.println(reversedName);
    }

    public static String reverseString1(String name) {
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        return reverse;
    }
}
