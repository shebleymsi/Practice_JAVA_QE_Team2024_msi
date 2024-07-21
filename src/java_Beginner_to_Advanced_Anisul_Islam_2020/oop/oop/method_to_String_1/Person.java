package java_Beginner_to_Advanced_Anisul_Islam_2020.oop.oop.method_to_String_1;

public class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : " + name + "\nAge : " + age;

    }
}
