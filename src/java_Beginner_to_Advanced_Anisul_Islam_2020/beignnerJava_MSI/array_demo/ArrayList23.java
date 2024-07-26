package java_Beginner_to_Advanced_Anisul_Islam_2020.beignnerJava_MSI.array_demo;

import java.util.ArrayList;

public class ArrayList23 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(0, 10);
        number.add(1, 20);
        number.add(2, 30);
        number.add(3, 40);
        number.add(4, 50);
        // Print 
        for (int x : number) {
            System.out.print(x + " ");
        }
        //The indexof 40 in ArrayList
        System.out.println("");
        System.out.println("");
        int pos = number.indexOf(40);
        System.out.println("The index of 40 is = " + pos);

        // check my given elements or contain?
        System.out.println("");
        boolean contain = number.contains(30);
        System.out.println("30 is in The ArrayList = " + contain);

        //isEmpty check ArrayList.
        System.out.println("");
        boolean empty = number.isEmpty();
        System.out.println("ArrayList Empty = " + empty);
        System.out.println("Size = " + number.size());

        // setting or Replaceing any number in any index
        System.out.println("");
        number.set(1, 147);
        System.out.println("Set or Replace 20 to 147 in index 1 = " + number);

        // get or Return or Show a elements by inder number
        System.out.println("");
        int x = number.get(1);
        System.out.println("Getting of Index 1 = " + x);

        // Remove elements : Adding elements in index of Array And then Removing
        System.out.println("");
        number.remove(2);
        System.out.println("After removing index(2=30)contains  = " + number);
        System.out.println("Size = " + number.size());

        // Remove all elements.
        System.out.println("");
        number.removeAll(number);
        System.out.println("After removing all = " + number);
        System.out.println("Size = " + number.size());

        //Clear all elements
        System.out.println("");
        number.clear();
        System.out.println("After clear all = " + number);
        System.out.println("Size = " + number.size());

    }

}
            