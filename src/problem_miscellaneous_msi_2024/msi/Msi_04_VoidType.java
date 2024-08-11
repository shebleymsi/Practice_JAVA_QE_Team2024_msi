package problem_miscellaneous_msi_2024.msi;

public class Msi_04_VoidType {

//    In the VoidTypeExample:
//    The printSum method takes two integers as input, calculates their sum, and directly prints the result.
//    The method does not return any value.
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        printSum(a, b);
    }

    // Method with void return type
    public static void printSum(int x, int y) {
        System.out.println("Sum: " + (x + y));
    }
}
