package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_01.oop.method_overriding;

public class Test {

    public static void main(String[] args) {

        Teacher t1 = new Teacher();
        t1.name = "Shahadul";
        t1.age = 35;
        t1.qualification = "MSc in Mathematics";
        t1.displayInformation();

        Person p1 = new Person();
        p1.name = "MSI";
        p1.age = 33;
        p1.displayInformation();

    }

}
