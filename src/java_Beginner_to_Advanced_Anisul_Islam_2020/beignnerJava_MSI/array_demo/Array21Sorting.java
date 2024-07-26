package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.array_demo;

import java.util.Arrays;

public class Array21Sorting {

    public static void main(String[] args) {

        int[] number = {10, -3, 18, 5, 25};

        Arrays.sort(number);
        
        System.out.println("Ascending : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+ number[i]);
           
        }
        System.out.println("");
        System.out.println("Dscending : ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(" "+ number[i]);
        }
        System.out.println("");
        System.out.println("Ascending : ");
        String[] names = {"MD", "SHAHADUL", "ISLAM", "SHEBLEY"};
        Arrays.sort(names);
        for (int i = 0; i < 4; i++) {
            System.out.print(" "+names[i]);
            
        }
        System.out.println("");
         System.out.println("Dscending : ");
         for (int i = 3; i >= 0; i--) {
             System.out.print(" "+names[i]);
            
        }
         System.out.println("");
        

    }
}
