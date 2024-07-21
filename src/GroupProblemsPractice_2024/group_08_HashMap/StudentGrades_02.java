package GroupProblemsPractice_2024.group_08_HashMap;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades_02 {
    public static void main(String[] args) {
        // Create a HashMap to store student grades
        Map<String, Integer> studentGrades = new HashMap<>();

        // Add student names and their grades to the map
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 90);
        studentGrades.put("Charlie", 75);

        System.out.println("---------" + studentGrades);

    }
}

