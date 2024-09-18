package programizExamplesPractice_2024_RUNNING.examples_02_TypeConversion;


public class Problem_004_01 {
    //Example 2: long to int conversion using toIntExact()
    public static void main(String[] args) {
        // create long variable
        long value1 = 52336L;
        long value2 = -445636L;

        // change long to int
        int num1 = Math.toIntExact(value1);
        int num2 = Math.toIntExact(value2);

        System.out.println(num1);
        System.out.println(num2);

        //The toIntExact() method throws an exception
        // if the returned int value is not within the range of the int data type.
        // That is, below ...

        // value out of range of int
        //long value = 32147483648L;
        // throws the integer overflow exception [ check it shebley ]
        //int num = Math.toIntExact(value);

    }


}
