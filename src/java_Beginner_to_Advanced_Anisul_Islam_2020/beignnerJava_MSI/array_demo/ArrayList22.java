package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.array_demo;

import java.util.ArrayList;
//import java.util.ArrayList; // When Iterator is Active.

public class ArrayList22 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>(); //ArrayList is Class.
        //for ArrayList need java.util package
        System.out.println("Size = " + number.size());
        //.size is Method
        //Adding elements in index of Array .
        number.add(10);  //add(Integer e) is Method.
        number.add(20);
        number.add(30);
        number.add(40);
        /* OR
        number.add(0, 10); //add(int i, Integer e) is Method.
        number.add(1, 20);
        number.add(2, 30);
        number.add(3, 40); */

        System.out.println("ArrayList Contains = " + number); //OR

        /*for(int x : number){   // using for each loop.
            System.out.print(x+" ");
        }*/                                                   //OR
        /*Iterator itr = number.iterator();//for Iterator need java.util package
        while (itr.hasNext()) {
            System.out.print(" "+itr.next());
        }*/
        // Here Iterator is Class,itr is Iterator Class Variable.
        System.out.println();
        System.out.println("Size = " + number.size());

        // Remove elements : Adding elements in index of Array And then Removing
        number.remove(2);
        System.out.println("After removing contains  = " + number);
        System.out.println("Size = " + number.size());

        // Remove all elements.
       
        number.removeAll(number);
        System.out.println("After removing all = " + number);
        System.out.println("Size = " + number.size());

    }

}
