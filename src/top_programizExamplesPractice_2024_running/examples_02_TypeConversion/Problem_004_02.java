package top_programizExamplesPractice_2024_running.examples_02_TypeConversion;


public class Problem_004_02 {
    //Example 2: long to int conversion using toIntExact()
    //In Java, we can also convert the object of wrapper class Long into an int.
    //For this, we can use the intValue() method. For, example,
    public static void main(String[] args) {

        // create an object of Long class
        Long obj = 52341241L;

        // convert object of Long into int
        // using intValue()
        int a = obj.intValue();

        System.out.println(a);    // 52341241
    }


}
