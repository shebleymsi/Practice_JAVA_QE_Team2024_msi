package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_01.oop.list_1;

import java.util.LinkedList;

public class LinkedListDemo1 {

    public static void main(String[] args) {

        LinkedList<String> countryNames = new LinkedList<String>();
        // () , here no size coz LinkeList start null but ArrayList start size

        countryNames.add("Bangladesh");
        countryNames.add("India");
        countryNames.add("Nepal");
        countryNames.add("Vhutan");

        System.out.println(countryNames);

    }

}
