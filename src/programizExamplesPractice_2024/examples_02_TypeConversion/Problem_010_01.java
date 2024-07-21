package programizExamplesPractice_2024.examples_02_TypeConversion;

public class Problem_010_01 {
    //Example 2: Convert int to object of Double using valueOf()
    public static void main(String[] args) {
        // create int variables
        int a = 33;
        int b = 29;

        // convert to an object of Double
        // using valueOf()
        Double obj1 = Double.valueOf(a);
        Double obj2 = Double.valueOf(b);

        System.out.println(obj1);    // 33.0
        System.out.println(obj2);    // 29.0
    }

}
