package learnJavaQEWinter2022.RakibProblemsPractice.HashMap08;

import java.util.HashMap;
import java.util.Map;


    public class StudentGrades_02 {
        public static void main(String[] args) {

            Map<String, Integer> studentGrades = new HashMap<>();
            studentGrades.put("Alice", 85);
            studentGrades.put("Bob", 90);
            studentGrades.put("Charlie", 75);

            // Display student grades
            for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

