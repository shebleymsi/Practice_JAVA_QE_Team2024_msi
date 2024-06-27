package RakibProblemsPractice.HashMap08;

import java.util.HashMap;
import java.util.Map;

public class StudentsGrades_02_01 {
    public static void main(String[] args) {
        // Create a HashMap to store student grades
        Map<String, Integer> studentGrades = new HashMap<>();

        // Add student names and their grades to the map
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 90);
        studentGrades.put("Charlie", 75);

        // Print the contents of the studentGrades map using a for loop
        System.out.println("Student Grades:");

        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

//            String name = entry.getKey();
//            int grade = entry.getValue();
//            System.out.println(name + " : " + grade);

        }
    }
}

