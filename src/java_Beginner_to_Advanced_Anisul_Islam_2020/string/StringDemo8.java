package java_Beginner_to_Advanced_Anisul_Islam_2020.string;

public class StringDemo8 {

    public static void main(String[] args) {

        /* String s1 = " madam ";
        StringBuffer sb = new StringBuffer(s1);
        String s2 = sb.reverse().toString();
        if(s1.equals(s2)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }  */
        /* String s1 = " Shebley ";
        StringBuffer sb = new StringBuffer(s1);
        String s2 = sb.reverse().toString();
        if(s1.equals(s2)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }  */
        /* String s1 = " madam ";
        StringBuilder sb = new StringBuilder(s1);
        String s2 = sb.reverse().toString();
        if (s1.equals(s2)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }*/
        String s1 = " madam ";
        StringBuffer sb = new StringBuffer(s1);
        sb.reverse();
        if (s1.equals(sb)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        /*  karon akta string type r sb variable ta chilo StringBuffer type
        ajonne not palindrome aschilo   */
    }

}
