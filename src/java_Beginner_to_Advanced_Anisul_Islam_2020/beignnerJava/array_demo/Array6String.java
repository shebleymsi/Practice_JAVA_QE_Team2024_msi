package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava.array_demo;

public class Array6String {

    public static void main(String[] args) {

        String[] names = new String[4];

        names[0] = "Md";
        names[1] = "Shahadul";
        names[2] = "Islam";
        names[3] = "Shebley";

        System.out.println(" Size of Array = " + names.length);

        for (int i = 0; i < 4; i++) {
            System.out.print(" " + names[i]);
        }
        System.out.println("");
    }

}
