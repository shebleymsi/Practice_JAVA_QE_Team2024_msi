package w3_JAVA.java_How_To;

import java.util.Scanner;

public class How_To_1_Add_Two_Numbers_User_Input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num1 = input.nextInt();

        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum is: " +sum);

        input.close();


    }

}
