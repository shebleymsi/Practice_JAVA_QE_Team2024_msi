package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_MSI.oop.list_3;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> fruitsName = new HashSet<String>();

        fruitsName.add("Apple");
        fruitsName.add("Banana");
        fruitsName.add("Strwberry");
        fruitsName.add("Orange");

        System.out.println(fruitsName);

        /*  for(String fruits : fruitsName){
            System.out.println(fruits);
        } 
         */
        System.out.println("HashSet Size : " + fruitsName.size());

        fruitsName.remove("Apple");
        System.out.println(fruitsName);

        fruitsName.clear();
        System.out.println(fruitsName);

        boolean value = fruitsName.isEmpty();
        System.out.println(value);

    }

}
