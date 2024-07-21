
package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_01.oop.inheritance;

public class Teacher extends Person {
    // name, age, displayInformation1()
    String qualification;
    
    void displayInformation2(){
        displayInformation1();
        System.out.println("qualification : "+qualification);
    }
    
}
