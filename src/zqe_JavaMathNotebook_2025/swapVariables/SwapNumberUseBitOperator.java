package zqe_JavaMathNotebook_2025.swapVariables;

public class SwapNumberUseBitOperator {


    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Print original values
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap the numbers using a helper method
        swap(a, b);
    }

    // Helper method to swap two numbers using bitwise XOR
    public static void swap(int a, int b) {
        a = a ^ b; // a now becomes 30 (in binary: 1010 ^ 10100)
        b = a ^ b; // b now becomes 10 (in binary: 11110 ^ 10100 = 1010)
        a = a ^ b; // a now becomes 20 (in binary: 11110 ^ 1010 = 10100)

        // Print swapped values inside the method
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

//So, this is an example of pass by value for primitive types in Java.


