package top_z_miscellaneous_msi_2024.msi;

public class Msi_02_VoidType {

//    In this example:
//    The printSquare method takes an integer as an argument, calculates its square, and prints the result.
//    It does not return any value.
//    The main method calls printSquare, which directly prints the result.

    public static void main(String[] args) {
        int number = 10;
        printSquare(number);
    }

    // Method with void return type
    public static void printSquare(int n) {
        int square = n * n;
        System.out.println("The square of " + n + " is: " + square);
    }
}
