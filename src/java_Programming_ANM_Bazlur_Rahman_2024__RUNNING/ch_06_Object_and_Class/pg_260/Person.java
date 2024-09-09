package java_Programming_ANM_Bazlur_Rahman_2024__RUNNING.ch_06_Object_and_Class.pg_260;

public class Person {
    private String name;
    private String email;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
    }
    public void printInfo1() {
        System.out.println("Name: " + name);

    }


}

