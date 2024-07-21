package java_Beginner_to_Advanced_Anisul_Islam_2020.string;

public class StringDemo6 {

    public static void main(String[] args) {
         //String declear, creat , print 
        String s1 = "My_name_is_Babul";
        System.out.println(s1);

        // divide a string by split method like put symbol, for each loop
        String[] s3 = s1.split("_");
        for (String x : s3) {
            System.out.println(x);
        }
        System.out.println("");
    }
}
