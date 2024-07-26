package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_MSI.oop.this_keyword_1;

public class Person {

    String name;
    int age;
    String haircolor;

    Person(String name, int age){
        this.name = name; // call instance variable
        this.age = age;
    }
    
    Person(String name, int age, String haircolor){
        this(name, age);  //call contractour
        this.haircolor = haircolor;
    }
    
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Hair color : "+haircolor);
        System.out.println("");
    }

}
