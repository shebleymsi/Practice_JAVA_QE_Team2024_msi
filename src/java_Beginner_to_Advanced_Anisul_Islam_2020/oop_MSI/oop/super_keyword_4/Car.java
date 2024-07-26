
package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_MSI.oop.super_keyword_4;

public class Car extends Vehicle{
    // color, weight, attribute().
    int gear;
    
    Car(String c, double w, int g){  
     /* weight = w;  
        super(c,w); */
        super(c,w);
        gear = g;
    }


    @Override
    void attribute(){
     /* System.out.println("Color : " + color);
        System.out.println("Weight : " + weight); */
        
        super.attribute();
        System.out.println("Gear : "+gear);
        
    }
    
}
