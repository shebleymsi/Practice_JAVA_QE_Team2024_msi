package java_Programming_ANM_Bazlur_Rahman_2024__RUNNING.porisisto_2_ObjectClass.pg_674_toString_method;

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
