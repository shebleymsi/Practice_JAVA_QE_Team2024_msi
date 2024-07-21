package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_01.oop.polymorphism_1;

public class Test {

    public static void main(String[] args) {

        Person p = new Person();
        p.display();
        p = new Teacher();
        p.display();
        p = new Student();
        p.display();

    }

}

// RUN TIME POLYMORPHISM OR DYNAMIC DITCHPATCH
