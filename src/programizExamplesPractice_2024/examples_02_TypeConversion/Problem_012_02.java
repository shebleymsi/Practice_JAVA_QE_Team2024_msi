package programizExamplesPractice_2024.examples_02_TypeConversion;

public class Problem_012_02 {
    // Example 3: Java Program to Convert a String containing comma to double
    public static void main(String[] args) {

        // create string variables
        String str = "614,33";

        // replace the , with .
        str = str.replace(",", ".");

        // convert String to double
        // using valueOf()
        double value = Double.parseDouble(str);

        // print double value
        System.out.println(value);    // 614.33
    }
}
