package learnJavaQEWinter2022.RakibProblemsPractice.ArrayList06;

import java.util.ArrayList;

public class EqualORNot_06 { //done

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println("Are the ArrayLists equal? " + list1.equals(list2)); // Should print true

        //==================================================================================
        // "Only numeric purpose we will use "=="
        int list3 = 9;
        int list4 = 9;
        if (list3 == list4) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}


