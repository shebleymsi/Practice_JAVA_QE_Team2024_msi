package programizExamplesPractice_2024.examples_02_TypeConversion;

public class Problem_005_01 {
    //Example 2: Java Program to Convert int into object of Long using valueof()

    public static void main(String[] args) {

        // create int variables
        int a = 25;

        // convert to an object of Long
        // using valueOf()
        Long obj = Long.valueOf(a);

        System.out.println(obj);    // 25
    }
    
}
