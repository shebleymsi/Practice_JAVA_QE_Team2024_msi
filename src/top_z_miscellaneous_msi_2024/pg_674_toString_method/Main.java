package top_z_miscellaneous_msi_2024.pg_674_toString_method;

public class Main extends Employee   {

    public Main(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Msi", 36);
        System.out.println(employee.toString());

        //===================================
        Main main = new Main("RU", 35);
        System.out.println( main.toString());

    }

}
