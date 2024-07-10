package programizExamplesPractice.Examples_02_typeConversion;

public class Problem_012_01 {
    // Example 2: Java Program to Convert string to double using valueOf()
    public static void main(String[] args) {

        // create string variables
        String str1 = "6143";
        String str2 = "21312";

        // convert String to double
        // using valueOf()
        double num1 = Double.valueOf(str1);
        double num2 = Double.valueOf(str2);

        // print double values
        System.out.println(num1);    // 6143.0
        System.out.println(num2);    // 21312.0
    }

    //Note: The string variables should represent the number value.
    // Otherwise, the compiler will throw an exception.
}
