package programizExamplesPractice_2024.examples_02_TypeConversion;



public class Problem_007 {
    //Example 1: Convert string to boolean using parseBoolean()
    public static void main(String[] args) {
        // create string variables
        String str1 = "true";
        String str2 = "false";

        // convert string to boolean
        // using parseBoolean()
        boolean b1 = Boolean.parseBoolean(str1);
        boolean b2 = Boolean.parseBoolean(str2);

        // print boolean values
        System.out.println(b1);    // true
        System.out.println(b2);    // false

    }




}