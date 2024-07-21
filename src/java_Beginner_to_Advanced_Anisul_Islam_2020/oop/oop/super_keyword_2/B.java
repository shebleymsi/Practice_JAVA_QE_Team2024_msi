package java_Beginner_to_Advanced_Anisul_Islam_2020.oop.oop.super_keyword_2;

public class B extends A {

    @Override //annotation
    void display() {
        message(); // not overriding method
        super.display(); // for super class print
        System.out.println("Inside B class");
        // overriding method name always same
    }

}
