package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_MSI.oop.list_2;

import java.util.LinkedList;

public class StudentListDemo {
    public static void main(String[] args) {
        
        //Student LinkedList
        LinkedList<Student> list = new LinkedList<Student>();
        
        //Student creat
        Student s1 = new Student(1654, "Shebley", "Mathematics");
        Student s2 = new Student(1655, "Sanjoy", "Mathematics");
        Student s3 = new Student(3555, "Sonia", "Mathematics");
        Student s4 = new Student(3554, "Uzzal", "Mathematics");
        
        // Adding Student to the StudentList
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        // information display
        
        for(Student s : list){
            System.out.println(s.id+"  "+s.name+"  "+s.className);
        }
     
    }

}
