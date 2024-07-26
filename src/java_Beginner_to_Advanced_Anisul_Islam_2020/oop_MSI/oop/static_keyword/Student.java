
package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_MSI.oop.static_keyword;

public class Student {
    
    String name;
    int id;
    static String universityName = "JU";
    
    Student(String n, int i){
        name = n;
        id = i;
    }
    
    void displayinformation(){
        System.out.println("Name = "+name);
        System.out.println("ID = "+id);
        System.out.println("University Name = "+universityName);
        
        System.out.println("\n");
    }
    
}
