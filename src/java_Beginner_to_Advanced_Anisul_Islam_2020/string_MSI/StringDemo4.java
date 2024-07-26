package java_Beginner_to_Advanced_Anisul_Islam_2020.string_MSI;

public class StringDemo4 {

    public static void main(String[] args) {
        
         //String declear, creat , print 
        String s1 = "   My name is Babul   ";
        System.out.println(s1);

        // replace any character
        String s2 = s1.replace('B', 'K');
        System.out.println(s2);

        //divide a string by split method like put symbol, for each loop
        String[] s3 = s1.split(" ");
        for (String x : s3) {
            System.out.println(x);
        }

        System.out.println("");
    }

}
