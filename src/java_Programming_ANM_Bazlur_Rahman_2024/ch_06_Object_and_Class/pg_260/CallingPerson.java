package java_Programming_ANM_Bazlur_Rahman_2024.ch_06_Object_and_Class.pg_260;

public class CallingPerson {
    public static void main(String[] args) {
        Person person1 = new Person("bazlur","bazlur@gmail.com",35);
        Person person2 = new Person("rakib","rakib@gmail.com",36);

        Person person3 = new Person("sakib");

        person1.printInfo();
        person2.printInfo();
        person3.printInfo();



    }
}
