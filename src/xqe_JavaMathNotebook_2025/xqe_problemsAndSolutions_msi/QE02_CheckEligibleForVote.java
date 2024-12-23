package xqe_JavaMathNotebook_2025.xqe_problemsAndSolutions_msi;

import java.util.Scanner;

public class QE02_CheckEligibleForVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Age: ");
        int voterAge = input.nextInt();

        System.out.println("Enter your Gender: ");
        String gender = input.next();


        if (gender.equalsIgnoreCase("female") && voterAge >= 18) {
            System.out.println("Female are Eligible to vote");
        } else if (gender.equalsIgnoreCase("male") && voterAge >= 18) {
            System.out.println("Male are Eligible to vote");
        } else {
            System.out.println("You are not Eligible to vote");
        }
    }


}
//How can I check if a person is eligible to vote based on their age and gender in Java?