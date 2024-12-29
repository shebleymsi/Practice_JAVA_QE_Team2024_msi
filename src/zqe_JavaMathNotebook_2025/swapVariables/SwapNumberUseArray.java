package zqe_JavaMathNotebook_2025.swapVariables;

public class SwapNumberUseArray {
    public static void main(String[] args) {
        int[] values = {10, 20};
        swap(values);
        System.out.println("After swapping: values[0] = " + values[0] + ", values[1] = " + values[1]);
    }

    // Helper method to swap the values in the array
    public static void swap(int[] values) {
        values[0] = values[0] + values[1]; // values[0] becomes 30
        values[1] = values[0] - values[1]; // values[1] becomes 10
        values[0] = values[0] - values[1]; // values[0] becomes 20
    }
}

//After swapping: values[0] = 20, values[1] = 10
// note:
// In Java, when you pass an array to a method, it is passed by reference.
// This means that any modifications made to the array within the method will affect the original array.