package programizExamplesPractice_2024.examples_02_TypeConversion;



public class Problem_011 {
    //Example 1: Java Program to Convert double to int using Typecasting
    public static void main(String[] args) {

        // create double variables
        double a = 23.78D;
        double b = 52.11D;

        // convert double into int
        // using typecasting
        int c = (int)a;
        int d = (int)b;

        System.out.println(c);    // 23
        System.out.println(d);    // 52
    }
    /*
    int c = (int)a;
    Here, the higher data type double is converted into a lower data type int.
    Hence, we need to explicitly use int inside the bracket.
    This is called narrowing typecasting.

    Note: This process works when the value of double is less than or equal to the maximum value of int (2147483647).
    Otherwise, there will be a loss in data.
     */



}
