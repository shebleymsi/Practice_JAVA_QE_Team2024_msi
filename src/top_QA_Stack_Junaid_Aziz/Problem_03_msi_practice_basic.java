package top_QA_Stack_Junaid_Aziz;

public class Problem_03_msi_practice_basic {
    public static void main(String[] args) {
        String name = "This is a string";
        regularString(name);
        System.out.println("\n");
        reverseString(name);

    }

    public static void regularString(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
        }

    }

    public static void reverseString(String name) {
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }

    }
}
