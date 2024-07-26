package java_Beginner_to_Advanced_Anisul_Islam_2020.string_MSI;

public class StringDemo1 {

    public static void main(String[] args) {
        String s1 = "Md Shahadul Islam Shebley";
        String s2 = new String("md shahadul islam shebley");
        char[] s3 = {'s', 'h', 'e', 'b', 'l', 'e', 'y'};

        // s1 s2 s3 print
        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
        System.out.println(s3);

        // length ( length() method)
        int len = s1.length(); //letter with space
        System.out.println("Length of s1 : " + len);

        // s1 equals s2 ( equals method )
        if (s1.equals(s2)) {
            System.out.println("s1 equal s2");
        } else {
            System.out.println("s1 not equal s2");
        }
        
        //OR
        // s1 equals s2 ( equals method )
        boolean c = s1.equals(s2);
        System.out.println("The String s1 and s2 are : " +c);

        /* ignor upper case and lower case in contains s1 and s2 
        equalsIgnoreCase() method */
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("s1 equal s2");
        } else {
            System.out.println("s1 not equal s2");
        }

        // contains method
        boolean con = s1.contains("Shebley");
        System.out.println(con);

        // isEmpty
        boolean b = s1.isEmpty();
        System.out.println("b : " + b);

    }

}
