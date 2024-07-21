package programizExamplesPractice_2024.examples_01_Introduction;

public class Problem_09 {
    //Example 1: Find Largest Among three numbers using if..else statement
    public static void main(String[] args) {
        int num1 = 20, num2 = 30, num3 = 40;
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("num1=" + num1 + " is the largest");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("num2=" + num2 + " is the largest");
        } else {
            System.out.println("num3=" + num3 + " is the largest");
        }

    }
}
