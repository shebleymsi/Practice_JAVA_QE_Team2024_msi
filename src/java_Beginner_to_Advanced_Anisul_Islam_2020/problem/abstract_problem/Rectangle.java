package java_Beginner_to_Advanced_Anisul_Islam_2020.problem.abstract_problem;

public class Rectangle extends Shape {

    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    void area() {
        double result = dim1 * dim2;
        System.out.println("Rectangle Area : " + result);
    }

}
