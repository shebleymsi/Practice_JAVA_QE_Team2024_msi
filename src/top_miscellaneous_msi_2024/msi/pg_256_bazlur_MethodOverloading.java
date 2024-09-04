package top_miscellaneous_msi_2024.msi;

public class pg_256_bazlur_MethodOverloading { // bazlur pg:257
    // give me simple example of method overloadin where order makes different data type same


    public void display(double a, int b) {
        System.out.println("Method with double first and int second: " + a + ", " + b);
    }

    // Method 2: first parameter is int, second is double

    public void display(int b, double a) {
        System.out.println("Method with int first and double second: " + a + ", " + b);
    }

    public static void main(String[] args) {
        pg_256_bazlur_MethodOverloading example = new pg_256_bazlur_MethodOverloading();

        // Calling method with double first and int second
        example.display(10.5, 5);

        // Calling method with int first and double second
        example.display(5, 10.5);
    }
}

