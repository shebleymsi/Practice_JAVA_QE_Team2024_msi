package java_Beginner_to_Advanced_Anisul_Islam_2020.oop.oop.file;

import java.io.File;
import java.util.Scanner;

public class FileDemo4 {

    public static void main(String[] args) {

        try {

            File file = new File("D:/OOP/person/teacher.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String id = scanner.next();
                String name = scanner.next();
                System.out.println("ID : " + id + "Name : "+ name);
            }
            scanner.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
