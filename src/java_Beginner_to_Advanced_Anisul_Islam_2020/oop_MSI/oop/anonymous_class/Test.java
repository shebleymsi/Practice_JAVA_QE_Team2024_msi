package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_MSI.oop.anonymous_class;

public class Test {

    public static void main(String[] args) {

        Person p = new Person() {

            @Override
            void display() {
                System.out.println("Person class");
            }
        };
        p.display();

    }

}
