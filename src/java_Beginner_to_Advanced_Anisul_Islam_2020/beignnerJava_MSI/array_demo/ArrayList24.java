
package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.array_demo;

import java.util.ArrayList;

public class ArrayList24 {
    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();
        
        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        number1.add(50);
        
        System.out.println("number1"+number1);
        
        number2.add(1);
        number2.add(2);
        number2.add(3);
        number2.add(4);
        number2.add(5);
        
        System.out.println("number2"+number2);
        
        number3.addAll(number1);
        System.out.println("number3"+number3);
        
        boolean equal = number1.equals(number2);
        System.out.println("number1 is equal to number2 : "+equal);
        
        equal = number1.equals(number3); //Already decalr equal is boolean
        System.out.println("number1 is equal to number3 : "+equal);
        
    }
    
}
