package top_QA_Stack_Junaid_Aziz;

public class Problem_03_msi_practice {
    public static void main(String[] args) {
        String name = "This_string";
        reverseString(name);

    }

    public static void reverseString(String name) {
        String reverse = "*";
        for (int i = name.length()-1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
            //System.out.println(reverse);
        }
        System.out.println(reverse);
    }
}
