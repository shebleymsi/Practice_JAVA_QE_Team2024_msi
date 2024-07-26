package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_MSI.oop.automatic_type_conversion;

public class AutomaticTypCconversion {

    void add(double a, double b) {
        System.out.println(a + b);
    }

}
  /*   
       Allowed promotions for primitive types
       
       TYPE -- VALID PROMOTIONS

       double -- None (double)
       float -- double
       long -- float or double
       int -- long, float, double
       char -- int, long, float, double
       short -- int, long, float, double
       byte -- short, int, long, float, double
       boolean -- None (boolean values are not considered
                        to be numbers in java language.)
*/