package top_z_miscellaneous_msi_2024.pg_674_toString_method;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return name + ": " + age;
    }



}
