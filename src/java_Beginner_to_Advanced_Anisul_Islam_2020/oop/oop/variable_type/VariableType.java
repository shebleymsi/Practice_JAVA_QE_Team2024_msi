
package java_Beginner_to_Advanced_Anisul_Islam_2020.oop.oop.variable_type;


public class VariableType {
    
    /* INSTANCE VARIABLE  : A variable that is declared inside the class 
    but outside any method that is called instance variable.
    it is not declared as ststic. its called also GLOBAL VARIABLE too. */
    String name;
    int id;
    
    /* STATIC /CLASS VARIABLE : A variable 
    that is declared as static is called static or class variable.
    it can not be declared as local variable. */
    static String universityName = "JU";
    
    /* LOCAL VARIABLE : A variable that is declared inside the method is called 
    local variable. 
    Local variable is declared inside method, constructor or in a block. */
    VariableType(String n, int i){
        name = n;
        id = i;
    }
    
    void displayinformation(){
        System.out.println("Name = "+name);
        System.out.println("ID = "+id);
        System.out.println("University Name = "+universityName);
        
        System.out.println("\n");
    }
    
    
    public static void main(String[] args) {
                VariableType s1 = new VariableType("Shebley",1654);
        s1.displayinformation();
        
        VariableType s2 = new VariableType("Msi", 1655);
        s2.displayinformation();
    }
    
}
