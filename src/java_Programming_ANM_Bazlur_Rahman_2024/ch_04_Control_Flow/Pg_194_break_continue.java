package java_Programming_ANM_Bazlur_Rahman_2024.ch_04_Control_Flow;

public class Pg_194_break_continue {
    // The objective of this program is to demonstrate the use of 'continue' and 'break' statements in a loop.
    public static void main(String[] args) {
        // Loop from 0 to 19
        for (int i = 0; i < 20; i++) {
            // If the number is even, skip the rest of the loop and continue with the next iteration
            if (i % 2 == 0) {
                continue;
            }
            // Print the number if it is odd
            System.out.println("The number is: " + i);

            // If the number is 15, break out of the loop
            if (i == 15) {
                break;
            }
        }
    }
}
