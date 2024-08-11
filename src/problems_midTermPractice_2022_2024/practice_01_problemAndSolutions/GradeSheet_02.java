package problems_midTermPractice_2022_2024.practice_01_problemAndSolutions;

import java.util.Scanner;

public class GradeSheet_02 {
    //  Write a Java program that determines a student’s grade.
    //  The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    //  the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F

    //See the example output below:
    //Quiz score: 80
    //Midterm score: 68
    //Final score: 90
    //Your grade is B.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the scores
        System.out.print("Quiz score: ");
        double quizScore = scanner.nextDouble();

        System.out.print("Midterm score: ");
        double midTermScore = scanner.nextDouble();

        System.out.print("Final score: ");
        double finalScore = scanner.nextDouble();

        // Calculate the average score
        double averageScore = (quizScore + midTermScore + finalScore) / 3;

        // Determine the grade
        char grade;
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 70) {
            grade = 'B';
        } else if (averageScore >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        // Print the grade
        System.out.println("Your grade is " + grade + ".");

        scanner.close();
    }
}


