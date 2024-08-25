package top_programizExamplesPractice_2024_running.examples_01_Introduction;

public class Problem_006_02_01 {
    // Example 1: Swap two numbers using temporary variable
    public static void main(String[] args) {
        float a = 1.20f;
        float b = 2.45f;

        // Value of a is assigned to temporary number c
        float c = a;
        // Value of second is assigned to first
        a = b;

        // Value of temporary (which contains the initial value of first) is assigned to second
        b = c;

        System.out.println("First number a = " + a);
        System.out.println("Second number b = " + b);
    }
}

