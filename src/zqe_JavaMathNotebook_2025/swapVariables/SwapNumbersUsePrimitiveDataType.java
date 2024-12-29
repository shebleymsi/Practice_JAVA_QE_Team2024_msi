package zqe_JavaMathNotebook_2025.swapVariables;

public class SwapNumbersUsePrimitiveDataType {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Print original values
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap the numbers
        swap(a, b);
    }

    // Function to swap two numbers using arithmetic operations
    public static void swap(int a, int b) {
        a = a + b; // a now becomes 30
        b = a - b; // b now becomes 10
        a = a - b; // a now becomes 20

        // Print swapped values
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

//In Java, all parameters are passed by value, which includes primitive types and objects (including arrays).
//When you pass a primitive data type (like int, double, etc.) to a method, you pass a copy of the value.
//Changes to the parameter within the method do not affect the original variable outside the method.


