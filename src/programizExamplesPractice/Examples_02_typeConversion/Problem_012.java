package programizExamplesPractice.Examples_02_typeConversion;

public class Problem_012 {
    //Example 1: Java Program to Convert string to double using parseDouble()
    public static void main(String[] args) {

        // create string variables
        String str1 = "23";
        String str2 = "456.6";

        // convert string to double
        // using parseDouble()
        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);

        // print double values
        System.out.println(num1);    // 23.0
        System.out.println(num2);    // 456.6
    }

    //Note: The string variables should represent the number value.
    // Otherwise, the compiler will throw an exception.
}
