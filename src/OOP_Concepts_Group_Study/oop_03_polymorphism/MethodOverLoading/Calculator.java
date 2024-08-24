package OOP_Concepts_Group_Study.oop_03_polymorphism.MethodOverLoading;

public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }


    public static int minus(int a, int b) {
        return a - b;
    }
    public static int minus(double a, double b) {
        return (int) (a - b);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two integers: " + calc.add(5, 10));        // Calls add(int, int)
        System.out.println("Sum of three integers: " + calc.add(5, 10, 15));  // Calls add(int, int, int)
        System.out.println("Sum of two doubles: " + calc.add(5.5, 10.5));     // Calls add(double, double)

        //Practice only:
        System.out.println(" Static method: " + Calculator.minus(20,30));
        System.out.println(" Static method: " + minus(20.5, 30.5));
    }
}
