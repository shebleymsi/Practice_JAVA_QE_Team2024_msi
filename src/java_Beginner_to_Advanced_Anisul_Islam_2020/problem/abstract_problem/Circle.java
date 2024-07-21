package java_Beginner_to_Advanced_Anisul_Islam_2020.problem.abstract_problem;

public class Circle extends Shape {

    Circle(double r) {
        super(r, r);
    }

    @Override
    void area() {
        double result = Math.PI * dim1 * dim2;
        System.out.println("Circle Area : " + result);
    }

}
