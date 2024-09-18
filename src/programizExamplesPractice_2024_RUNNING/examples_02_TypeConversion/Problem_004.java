package programizExamplesPractice_2024_RUNNING.examples_02_TypeConversion;



public class Problem_004 {
    //Example 1: Java Program to Convert long to int using Typecasting

    //Here, the higher data type long is converted into the lower data type int.
    //Hence, this is called narrowing typecasting.
    public static void main(String[] args) {

        // create long variables
        long a = 2322331L;
        long b = 52341241L;

        // convert long into int
        // using typecasting
        int c = (int)a;
        int d = (int)b;

        System.out.println(c);    // 2322331
        System.out.println(d);    // 52341241
    }


}
