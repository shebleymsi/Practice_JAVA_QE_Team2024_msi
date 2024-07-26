
package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_MSI.oop.this_keyword_2;

public class Person {
    
    
    void message(){
        System.out.println("I am message method");
    }
    
    void display(){
        message(); // compiler mean "this"
        System.out.println("I am display method");
    }
              
    
}
