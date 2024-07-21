package java_Beginner_to_Advanced_Anisul_Islam_2020.oop.oop.static_method_res;

public class StaticMethodRestrictions {
    
    static int x = 10;
    
    void display1(){
        System.out.println("I am non static method");
    }
    static void display2(){
        System.out.println("i am static method");
        System.out.println(""+x);
    }
    
}
