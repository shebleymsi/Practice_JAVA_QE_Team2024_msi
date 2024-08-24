package OOP_Concepts_Group_Study.oop_05_miscellaneous.keyWord_01_final.W3School;

public class Old_02_Car extends Old_01_Vehicle {

    private String modelName = "Mustang";

    // Car attribute
    public static void main(String[] args) {
        String name = "Shebley";
        name = "Rakib";
        System.out.println(name);

        String name2 = "Shebley";
        System.out.println(name2);

        final int wheel = 4;
        //wheel = 3; it does not work because wheel is final

        // Create a myCar object
        Old_02_Car myCar = new Old_02_Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();
        // myCar.brand = "Tesla"; // it will not work coz brand is final


        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand);
        System.out.println(myCar.modelName);

    }
}
