package top_programizExamplesPractice_2024_RUNNING.examples_02_TypeConversion;

public class Problem_005 {
    //Example 1: Java Program to Convert int to long using Typecasting

    //Here, the int type variable is automatically converted into long.
    //It is because long is a higher data type and int is a lower data type.
    //Hence, there will be no loss in data while converting from int to long.
    //This is called widening typecasting.

    public static void main(String[] args) {
        int a = 25;
        int b = 34;

        // convert int into long
        // using typecasting
        long c = a;
        long d = b;

        System.out.println(c);
        System.out.println(d);
    }

}
