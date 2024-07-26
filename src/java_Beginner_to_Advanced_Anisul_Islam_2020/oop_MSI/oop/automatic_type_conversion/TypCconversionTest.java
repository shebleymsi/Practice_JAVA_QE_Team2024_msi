package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_MSI.oop.automatic_type_conversion;

public class TypCconversionTest {

    public static void main(String[] args) {

        AutomaticTypCconversion ob = new AutomaticTypCconversion();
        ob.add(2, 3);  // int to double
        ob.add(3.f, 3); // float, int to double 
        ob.add(2.2, 3.3); // double to double

    }

}
