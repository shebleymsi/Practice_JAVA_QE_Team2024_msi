package java_Beginner_to_Advanced_Anisul_Islam_2020.problem.abstract_problem;

public class Triangle extends Shape {

    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    void area() {
        double result = 0.5 * dim1 * dim2;
        System.out.println("Triangle Area : " + result);
    }

}
