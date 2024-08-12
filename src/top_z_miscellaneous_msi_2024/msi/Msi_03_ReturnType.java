package top_z_miscellaneous_msi_2024.msi;

public class Msi_03_ReturnType {

//    In the ReturnTypeExample:
//    The add method takes two integers as input, calculates their sum, and returns it.
//    The main method captures the returned value and prints it.
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = add(a, b);
        System.out.println("Sum: " + sum);
    }

    // Method with return type int
    public static int add(int x, int y) {
       // int c = x + y; // redundant = অপ্রয়োজনীয়
        return x + y;
    }
}

