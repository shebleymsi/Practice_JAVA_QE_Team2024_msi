package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_MSI.oop.file;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileDemo3 {

    public static void main(String[] args) {

        String id, name;

        try {

            Formatter formatter = new Formatter("D:/OOP/person/teacher.txt");

            Scanner input = new Scanner(System.in);
            System.out.print("Enter how many students : ");
            int num = input.nextInt();

            for (int i = 1; i <= num; i++) {
                System.out.print("Enter students id & name : ");
                id = input.next();
                name = input.next();
                formatter.format("%s %s\r\n", id, name);
            }

            formatter.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }

}
