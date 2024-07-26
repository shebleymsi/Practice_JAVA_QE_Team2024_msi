package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_MSI.oop.method_string_comparision;

public class StringComparision3 {

    public static void main(String[] args) {

        String password1 = "Shebley123";
        String password2 = "Shebley123";
        String password3 = new String("Shebley123");
        String password4 = new String("Shebley123");

        System.out.println(password1 == password2);
        System.out.println(password1 == password3);
        System.out.println(password3 == password4);

    }

}
