package XQE_JavaMathNotebook_2025.xqe_problemsAndSolutions_msi;

public class QE18_ReverseString_BeginningToEnd {
    public static void main(String[] args) {
        String name = "James";
        String reversedName = reverseString(name);
        System.out.println(reversedName);
    }

    public static String reverseString(String name) {
        String reverse = "";
        for (int i = 0; i < name.length(); i++) {
            reverse = name.charAt(i) + reverse;
        }
        return reverse;
    }
}
