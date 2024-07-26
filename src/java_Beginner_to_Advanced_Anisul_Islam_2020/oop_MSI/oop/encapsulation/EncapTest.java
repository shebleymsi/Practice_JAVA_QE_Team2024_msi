package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_MSI.oop.encapsulation;

public class EncapTest {

    public static void main(String[] args) {

        Person p1 = new Person();
       /* p1.name = "Msi";
        p1.age = 35;
        p1.display(); */
       
       p1.setName("Msi");
       p1.setAge(35);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}
