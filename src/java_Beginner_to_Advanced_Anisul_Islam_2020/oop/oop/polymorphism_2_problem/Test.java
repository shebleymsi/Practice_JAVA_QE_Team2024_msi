
package java_Beginner_to_Advanced_Anisul_Islam_2020.oop.oop.polymorphism_2_problem;

public class Test {

    public static void main(String[] args) {
        //SYSTEM 01. USE ARRAY AND LOOP
        
        Shape[] s = new Shape[3];

        s[0] = new Shape();
        s[1] = new Rectangle(10, 20);
        s[2] = new Triangle(10, 20);

        for (int i = 0; i < 3; i++) {
            System.out.println(s[i].area());
        }
    }
}
     // SYSTEM 02. USE OBJECT AND METHOD

   /*   Shape s = new Shape();
        Rectangle r = new Rectangle(10,20);
        Triangle t = new Triangle(10,20);
        
        System.out.println(s.area());
        System.out.println(r.area());
        System.out.println(t.area());
        
    }
  */

/*
    //  SYSTEM 03. USE RUN TIME POLYMORPHISM OR
    //  DYNAMIC DITCHPATCH. 
     
        Shape s1 = new Shape();
        Shape s2 = new Rectangle(10,20);
        Shape s3 = new Triangle(10,20);
        
        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());
    }
   */
