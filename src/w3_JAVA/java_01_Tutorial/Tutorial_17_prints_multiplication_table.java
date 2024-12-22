package w3_JAVA.java_01_Tutorial;

public class Tutorial_17_prints_multiplication_table {
    //prints the multiplication table for a specified number, like 2:
    //2 x 1 = 2
    public static void main(String[] args) {
        int number = 2;
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
