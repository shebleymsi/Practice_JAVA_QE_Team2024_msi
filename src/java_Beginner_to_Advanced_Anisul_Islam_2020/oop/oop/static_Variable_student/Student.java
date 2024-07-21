
package java_Beginner_to_Advanced_Anisul_Islam_2020.oop.oop.static_Variable_student;

public class Student {
    
    static int count = 0;
    
    Student(){
        count ++;
    }

    public Student(String shebley, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void displayinformation(){
        System.out.println("Total Student : "+count);
    }
    
}
