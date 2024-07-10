package programizExamplesPractice.Examples_01_introduction;

import java.util.Scanner;

public class Problem_10_Next { // next
    // Java Program to Find all Roots of a Quadratic Equation(দ্বিঘাত সমীকরণ)
    // discriminant (বৈষম্যমূলক)
    // determinant (নির্ধারক)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get coefficients a, b and c from the user
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate the determinant
        double determinant = b * b - 4 * a * c; //b^2-4ac


        // Check the nature of the roots based on the discriminant
        if (determinant > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.println("The roots are real and distinct.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);

        } else if (determinant == 0) {
            // One real and equal root
            double root = -b / (2 * a);
            System.out.println("The roots are real and equal.");
            System.out.println("Root: " + root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
            System.out.println("The roots are complex and imaginary.");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }

}
