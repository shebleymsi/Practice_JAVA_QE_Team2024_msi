package problems_midTermPractice_2022_2024_group.practice_01_problemAndSolutions;

import java.util.Scanner;

public class ArithmeticOperator_01 {
    // Question:
    // Write Java program to allow the user to input two integer values and then the program prints the results of
    // adding,
    // subtracting,
    // multiplying,
    // and dividing among the two values.

    public static void main(String[] args) {

        doCalculation1(); // static method call by class_name, by default its work in same class without class_name

        ArithmeticOperator_01 AO = new ArithmeticOperator_01();
        AO.doCalculation(); // non-static method call by object name.

    }

    //Practice test method doCalculation1()
    public static void doCalculation1() {
        System.out.println("Practice test method.");

    }

    // Answer to the Question:
    public void doCalculation() {

        Scanner doCalculate = new Scanner(System.in);

        System.out.print("Please enter first number for addition : ");
        int number1 = doCalculate.nextInt();

        System.out.print("Please enter next number to be added by : ");
        int number2 = doCalculate.nextInt();

        int add = number1 + number2;
        System.out.println("Total summation is : " + add);

        int sub = number1 - number2;
        System.out.println("Total subtractions is : " + sub);

        double multiply = number1 * number2;
        System.out.println("Total multiplication is : " + multiply);

        double Divided = number1 / number2;
        System.out.println("Total division  is : " + Divided);

        // practice Test:
        int remainder = number1 % number2;
        System.out.println("Total division's remainder is : " + remainder);
    }

    }


