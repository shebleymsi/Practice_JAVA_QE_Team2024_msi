package top_SDET_JAVA_Programs_Kushal_Parikh_RUNNING.sdet_03_arrays;

import java.util.Objects;

public class SDET_13_Student_Override {
    //Java program to implement hashcode  and equals
    private int id;
    private String name;

    // Constructor
    public SDET_13_Student_Override(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters (omitted for brevity)
    // hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        SDET_13_Student_Override student = (SDET_13_Student_Override) obj;
        return id == student.id && Objects.equals(name, student.name);
    }

    public static void main(String[] args) {
        // Creating objects of Student class
        SDET_13_Student_Override student1 = new SDET_13_Student_Override(1, "Alice");
        SDET_13_Student_Override student2 = new SDET_13_Student_Override(2, "Bob");
        SDET_13_Student_Override student3 = new SDET_13_Student_Override(1, "Alice");
        // Testing equals method
        System.out.println("student1.equals(student2): " + student1.equals(student2)); // Output: false
        System.out.println("student1.equals(student3): " + student1.equals(student3)); // Output: true
        // Testing hashCode method
        System.out.println("Hashcode of student1: " + student1.hashCode());
        System.out.println("Hashcode of student2: " + student2.hashCode());
        System.out.println("Hashcode of student3: " + student3.hashCode());
    }

}
