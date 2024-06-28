package rakibProblems.variable02;

public class SwapVariables07 {

        public static void main(String[] args) {
            // Declare and initialize two integer variables
            int a = 5;
            int b = 10;

            // Print values before swap
            System.out.println("Before swap: a = " + a + ", b = " + b);

            // Swap the values
            int temp = a;
            a = b;
            b = temp;

            // Print values after swap
            System.out.println("After swap: a = " + a + ", b = " + b);
        }
    }

