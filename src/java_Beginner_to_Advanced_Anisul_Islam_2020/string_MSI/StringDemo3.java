package java_Beginner_to_Advanced_Anisul_Islam_2020.string_MSI;

public class StringDemo3 {

    public static void main(String[] args) {

        //String declear, creat , print 
        String country = "   Bangladesh is my country   ";
        System.out.println(country);

        // head and tail space trim, not middle space trim
        String space = country.trim();
        System.out.println(space);

        // charAt = for given integer value its return character
        char ch = country.charAt(3);
        System.out.println("ch : " + ch);

        //codePointAt = given integer value its return aski value of character
        int value = country.codePointAt(3);
        System.out.println("value(aski) B : " + value);

        //indexOf = put character return index number
        int pos = country.indexOf("n"); // its find 1st n always
        System.out.println("Firet position of n : " + pos);

        //put string but its count strings 1st character's return index number
        int pos1 = country.indexOf("is");
        System.out.println("Firet position of 'i's : " + pos1);

        /*lastIndexOf("n") = if more than one same character,
        its return last position of same character  */
        int pos2 = country.lastIndexOf("n");
        System.out.println("last position of n : " + pos2);

    }

}
