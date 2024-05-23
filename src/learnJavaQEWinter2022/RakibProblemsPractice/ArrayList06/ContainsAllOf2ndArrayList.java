package learnJavaQEWinter2022.RakibProblemsPractice.ArrayList06;
import java.util.ArrayList;

//Check if an ArrayList of strings contains all elements of another ArrayList.

public class ContainsAllOf2ndArrayList {

        public static void main(String[] args) {
            ArrayList<String> list1 = new ArrayList<>();
            list1.add("apple");
            list1.add("banana");
            list1.add("orange");

            ArrayList<String> list2 = new ArrayList<>();
            list2.add("banana");
            list2.add("orange");

            boolean containsAll = list1.containsAll(list2);

            System.out.println("Does list1 contain all elements of list2? " + containsAll);
        }
    }


