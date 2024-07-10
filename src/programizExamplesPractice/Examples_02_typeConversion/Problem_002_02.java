package programizExamplesPractice.Examples_02_typeConversion;


public class Problem_002_02 {
    // Example 3: char to int using parseInt() method    public static void main(String[] args) {
    public static void main(String[] args) {

        // create char variables
        char a = '5';
        char b = '9';

        // convert char variables to int
        // Use parseInt()
        int num1 = Integer.parseInt(String.valueOf(a));
        int num2 = Integer.parseInt(String.valueOf(b));

        // print numeric value
        System.out.println(num1);    // 5
        System.out.println(num2);    // 9
    }
}





