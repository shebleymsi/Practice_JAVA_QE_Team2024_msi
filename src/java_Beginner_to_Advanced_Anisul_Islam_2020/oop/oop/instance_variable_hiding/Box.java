
package java_Beginner_to_Advanced_Anisul_Islam_2020.oop.oop.instance_variable_hiding;

public class Box {
        double height, width, depth;

    Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void displaymethod() {
        double vol = height * width * depth;
        System.out.println("Volume is = " + vol);
    }
    
}
