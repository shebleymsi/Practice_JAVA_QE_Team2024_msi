package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_MSI.oop.file;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileDemo2 {

    public static void main(String[] args) {

   /*     try {
            Formatter formatter = new Formatter("D:/OOP/person/student.txt");
            
            formatter.format("%s %s\r\n","101","Msi");
            formatter.format("%s %s\r\n","102","Soni");
            
            formatter.close();
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } */
   
        String id, name;

        try {
            Formatter formatter = new Formatter("D:/OOP/person/student.txt");
            
            Scanner input = new Scanner(System.in);
            System.out.print("How many students : ");
            int num = input.nextInt();

            for (int i = 1; i <= num; i++) {
                System.out.print("Enter student id and name : ");
                id = input.next();
                name = input.next();
                formatter.format("%s %s\r\n", id, name);
            }
            
            formatter.close();  // Writing close
            
        } catch (FileNotFoundException e) { 
            System.out.println(e);
        }

    }

}
