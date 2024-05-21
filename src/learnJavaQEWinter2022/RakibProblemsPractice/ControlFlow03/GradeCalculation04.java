package learnJavaQEWinter2022.RakibProblemsPractice.ControlFlow03;
import java.util.Scanner;


public class GradeCalculation04 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the student's score: ");
            int score = scanner.nextInt();

            char grade;
            if (score >= 90 && score <= 100) {
                grade = 'A';
            } else if (score >= 80 && score < 90) {
                grade = 'B';
            } else if (score >= 70 && score < 80) {
                grade = 'C';
            } else if (score >= 60 && score < 70) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("The student's grade is: " + grade);

            scanner.close();
        }
    }


