package w3_JAVA.java_01_Tutorial;

public class Tutorial_14_Nested_loop {
    public static void main(String[] args) {
        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop :
            for (int j = 1; j <= 3; j++) {
                System.out.println("    Inner: " + j); // Executes 6 times (2 * 3)

            }
        }
    }
}
//The "inner loop" will be executed one time for each iteration of the "outer loop":
//use //break; for inside child loop the see