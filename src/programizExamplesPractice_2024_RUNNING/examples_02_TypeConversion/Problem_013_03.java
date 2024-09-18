package programizExamplesPractice_2024_RUNNING.examples_02_TypeConversion;


public class Problem_013_03 {
    //Example 4: Java Program to Convert double to String using format()
    public static void main(String[] args) {

        // create a double variable
        double num = 99.99;

        // convert double to string using format()
        String str = String.format("%f", num);

        System.out.println(str);    // 99.990000
    }


}
