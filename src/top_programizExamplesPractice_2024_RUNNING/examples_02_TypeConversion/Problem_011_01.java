package top_programizExamplesPractice_2024_RUNNING.examples_02_TypeConversion;



public class Problem_011_01 {
    //Example 2: Convert double to int using Math.round()
    public static void main(String[] args) {

        // create double variables
        double a = 99.99D;
        double b = 52.11D;

        // convert double into int
        // using typecasting
        int c = (int)Math.round(a);
        int d = (int)Math.round(b);

        System.out.println(c);    // 100
        System.out.println(d);    // 52
    }

}
