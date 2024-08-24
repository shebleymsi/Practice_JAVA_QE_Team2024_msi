package OOP_Concepts_Group_Study.oop_02_Inheritance.W3School;

public class Old_02_Car extends Old_01_Vehicle {

    private String modelName = "Mustang";

    // Car attribute
    public static void main(String[] args) {

        // Create a myCar object
        Old_02_Car myCar = new Old_02_Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand);
        System.out.println(myCar.modelName);

    }
}
