package programizExamplesPractice_2024_RUNNING.examples_02_TypeConversion;

public class Problem_010 {
    //Example 1: Java Program to Convert int to double using Typecasting
    public static void main(String[] args) {
        // create int variables
        int a = 33;
        int b = 29;

        // convert int into double
        // using typecasting
        double c = a;
        double d = b;

        System.out.println(c);    // 33.0
        System.out.println(d);    // 29.0
    }
    /*
    Here, the int type variable is automatically converted into double.
    It is because double is a higher data type (data type with larger size)
    and int is a lower data type (data type with smaller size).
    Hence, there will be no loss in data while converting from int to double. This is called widening typecasting.
     */
}
