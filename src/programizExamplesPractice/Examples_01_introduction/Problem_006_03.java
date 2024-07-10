package programizExamplesPractice.Examples_01_introduction;

public class Problem_006_03 {
    // Example 2: Swap two numbers without using temporary variable

    public static void main(String[] args) {
        SwapNumbers();
    }

    // Method to swap numbers
    public static void SwapNumbers() {
        // Initialize two float variables
        float first = 12.0f;
        float second = 24.5f;

        // Print the values of variables before swapping
        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Swap the values using arithmetic operations

        first = first - second;
        // first = 12.0 - 24.5 = - 12.5
        // first now holds the difference of first and second

        second = first + second; // [ here, first is updated_one/first ]
        // second = -12.5 + 24.5 = 12.0
        // second now holds the original value of first

        first = second - first; // [ here, second is updated_one/second ]
        // first = 12.0 - (-12.5) = 24.5
        // first now holds the original value of second

        // Print the values of variables after swapping
        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
