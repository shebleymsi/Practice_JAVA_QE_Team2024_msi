package java_Beginner_to_Advanced_Anisul_Islam_2020.string_MSI;

public class StringDemo5 {

    public static void main(String[] args) {
         //String declear, creat , print 
        String s1 = "929-424-1921";
        System.out.println(s1);

        // divide a string by split method like put symbol, for each loop
        String[] s3 = s1.split("-");
        for (String x : s3) {
            System.out.println(x);
        }

    }

}
