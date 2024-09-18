package programizExamplesPractice_2024_RUNNING.examples_01_Introduction;

public class Problem_006_02 {
    // Example 1: Swap two numbers using temporary variable
    public static void main(String[] args) {
        float first_a = 1.20f, second_b = 2.45f;
        System.out.println("--Before swap--");
        System.out.println("First number = " + first_a);
        System.out.println("Second number = " + second_b);

        // Value of first is assigned to temporary
        float temporary_temp = first_a;

        // Value of second is assigned to first
        first_a = second_b;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second_b = temporary_temp;

        System.out.println("--After swap--");
        System.out.println("First number = " + first_a);
        System.out.println("Second number = " + second_b);
    }
}

