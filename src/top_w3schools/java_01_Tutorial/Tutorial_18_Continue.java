package top_w3schools.java_01_Tutorial;

public class Tutorial_18_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                System.out.print(" ");
                continue;
            }
            System.out.print(i);
        }
    }

}
//The continue statement breaks one iteration (in the loop),
// if a specified condition occurs, and continues with the next iteration in the loop.
// This example skips the value of 4
