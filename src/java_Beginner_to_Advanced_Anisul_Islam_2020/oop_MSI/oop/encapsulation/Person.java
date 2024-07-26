package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_MSI.oop.encapsulation;

public class Person {

   /* String name;
    int age;

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age); 
    } */
    
   /* private String name;
    private int age;
    
Mouse right button > insert code > Getter and Setter > tik mark > Generate */
    
    private String name;
    private int age;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
        public int getAge(){
        return age;
    }
    
    
}
