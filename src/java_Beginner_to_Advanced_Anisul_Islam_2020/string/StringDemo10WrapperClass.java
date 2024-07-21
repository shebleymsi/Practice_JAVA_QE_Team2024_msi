package java_Beginner_to_Advanced_Anisul_Islam_2020.string;

public class StringDemo10WrapperClass {

    public static void main(String[] args) {

        // Autoboxing - Primitive to object
        
        int x = 30;
        Integer y = x; //Integer.valueOf(x);
        System.out.println("y = " + y);

        // unboxing  - object to Integer
        
        Double d = 10.25; // new Double(10.25);
        double e = d; //d.doubleValue()
        System.out.println("e = " + e);

    }

}
