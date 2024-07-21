package java_Beginner_to_Advanced_Anisul_Islam_2020.problem.problem_solving;
/* Create a class called Box that icclude
three pieces of information as instance variable-
height ,width and depth (type double) of two boxes.
Your class should have a constractor initializes the three instance variables.
Provid a method displayVol that display the volume of two boxes.
Suppose, the values of instance variable for
the first box's are (10,10,10) and
the second box's are (20,30,10).
Write a test application named BoxVolume 
that demonstrate class Box's capabilities. */

public class Box {

    double height, width, depth;

    Box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    void displaymethod() {
        double vol = height * width * depth;
        System.out.println("Volume is : " + vol);
    }

}

