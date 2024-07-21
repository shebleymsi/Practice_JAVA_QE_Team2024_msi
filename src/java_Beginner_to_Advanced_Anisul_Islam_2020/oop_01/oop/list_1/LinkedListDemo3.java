package java_Beginner_to_Advanced_Anisul_Islam_2020.oop_01.oop.list_1;

import java.util.LinkedList;

public class LinkedListDemo3 {

    public static void main(String[] args) {

        LinkedList<String> countryNames = new LinkedList<String>();
        // () , here no size coz LinkeList start null but ArrayList start size

        countryNames.add("Bangladesh");
        countryNames.add("India");
        countryNames.add("Nepal");
        countryNames.add("Vhutan");
        countryNames.add("Japan");
        countryNames.add("Franc");
        countryNames.add(5, "Brazil");
        countryNames.addFirst("Australia");
        countryNames.addLast("Mexico");
        // countryNames.remove("Japan");
        //countryNames.remove(5);
        // countryNames.removeFirst();
        // countryNames.removeLast();

        for (String country : countryNames) {
            System.out.println(country);
        }

        System.out.println("Size LinkList : " + countryNames.size());
        System.out.println(countryNames.getFirst());
        System.out.println(countryNames.getLast());
        
        countryNames.clear();
        System.out.println(countryNames);

    }
}
