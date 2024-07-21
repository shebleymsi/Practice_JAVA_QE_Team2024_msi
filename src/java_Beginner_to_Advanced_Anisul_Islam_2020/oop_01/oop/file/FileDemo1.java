package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_01.oop.file;

import java.io.File;

public class FileDemo1 {

    public static void main(String[] args) {

        // creat directory or folder
        
        
        /*File dir = new File("person");
        dir.mkdir();*/
        
         /*File dir = new File("C:/Users/shebl/Desktop/person");
        dir.mkdir();

        String path = dir.getAbsolutePath();
        System.out.println(path);

        System.out.println(dir.getName());

        // dir.delete();
        
        if (dir.delete()) {
            System.out.println(dir.getName() + " folder has been deleted");
        }
         */
         
        // creat file
        
        File dir = new File("person");
        dir.mkdir(); // directory will be created.
        String path = dir.getAbsolutePath();

        /* File file1 = new File("student.txt");  // file creat in  project
        File file2 = new File("teacher.txt"); */
        
        /* File file1 = new File("D:/OOP/person/student.txt"); // folder path searching by file creat in location
        File file2 = new File("D:/OOP/person/teacher.txt"); */
        
        
        File file1 = new File(path + "/student.txt"); // directly here creat in location
        File file2 = new File(path + "/teacher.txt"); // file name here
        
        // file created by try_catch
        try {

            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created");

        } catch (Exception e) {
            System.out.println(e);
        }

        //file 1 exists
        if (file1.exists()) {
            System.out.println("file1 exists");
        }

        // file2 delet and check
        
      /*  file2.delete();

        if (file2.exists()) {
            System.out.println("file2 exists");
        } else {
            System.out.println("file2 does not exists");
        } */

    }

}
