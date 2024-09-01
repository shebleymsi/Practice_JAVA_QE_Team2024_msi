package top_SDET_JAVA_Programs_Kushal_Parikh_RUNNING.sdet_01_common;

public class SDET_04_Swap_without_3rd_variable {
    // Java program to swap two numbers without using third variable
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Output before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap without using a third variable
        a = a + b; // a now becomes 30 (10 + 20)
        b = a - b; // b now becomes 10 (30 - 20)
        a = a - b; // a now becomes 20 (30 - 10)

        // Output after swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

}
