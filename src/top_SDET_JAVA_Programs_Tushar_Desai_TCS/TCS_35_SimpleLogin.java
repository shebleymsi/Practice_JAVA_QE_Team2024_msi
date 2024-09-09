package top_SDET_JAVA_Programs_Tushar_Desai_TCS;

import java.util.Scanner;

public class TCS_35_SimpleLogin {
    //35. Implement a Simple Login System
    public static void main(String[] args) {
        String username = "admin";
        String password = "password";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();
        if (username.equals(inputUsername) && password.equals(inputPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
    }

}
