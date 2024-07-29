package miscellaneous_msi_2024.msi;

public class Msi_01_ReturnType {
//    In this example:
//    The square method takes an integer as an argument and returns an integer (the square of the input number).
//    The main method calls square, captures the return value in the result variable, and prints it.
    public static void main(String[] args) {
        int number = 10;
        int result = square(number);
        System.out.println("The square of " + number + " is: " + result);
    }

    // Method with return type int
    public static int square(int n) {
        return n * n;
    }
}

