
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.array_demo;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayList25Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(20);
        number.add(-3);
        number.add(18);
        number.add(99);
        number.add(98);
        System.out.println(number);
        
        Collections.sort(number); //import java.util.Collections;
        System.out.println("Ascending : "+number);
        
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("Dscending : "+number);
        
    }
    
}
