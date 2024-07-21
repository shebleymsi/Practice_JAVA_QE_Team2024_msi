package java_Beginner_to_Advanced_Anisul_Islam_2020.string;

public class StringDemo2 {

    public static void main(String[] args) {
        String firstName = "Md Shahadul Islam";
        String lastName = " Shebley";

        //String concadination ( add ).
        String fullName = firstName + lastName;
        System.out.println("FullName : " + fullName + " " + 35);
        // concadination integer number(35) with String.
        //OR
        String name = firstName + lastName;
        System.out.println("Name : " + fullName);

        //OR concat method.
        String totalName = firstName.concat(lastName);
        System.out.println("TotalName : " + totalName);

        //toUpperCase
        String upperName = fullName.toUpperCase();
        System.out.println("UpperName : " + upperName);

        //toLowerCase
        String lowerName = fullName.toLowerCase();
        System.out.println("LowerName : " + lowerName);

        // startWith
        boolean b = firstName.startsWith("Md Shahadul");
        System.out.println("b = " + b);

        //endsWith
        boolean l = lastName.endsWith("bley");
        System.out.println("l = " + l);

        //String Array use (for each loop)
        String[] names = {"Md", "Shahadul", "Islam", "Shebley"};
        for (String x : names) {
            System.out.print(" " + x);
        }

        //String Array use (for loop)
        System.out.println("");
        String[] subject = {"Md", "Shahadul", "Islam", "Shebley"};
        for (int i = 0; i < 4; i++) {
            System.out.print(" " + subject[i]);
        }
        System.out.println("");

    }
}
