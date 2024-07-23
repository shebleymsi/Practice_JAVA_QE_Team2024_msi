package group_ProblemsPractice_RU_2024.group_06_ArrayList;

import java.util.ArrayList;

public class ArrayListWithAraay_03 { //done
    public static void main(String[] args) {
        int[] class1 = {11, 23, 44, 22, 55};
        int[] class2 = {10, 9, 30, 13, 20};
        int[] class3 = {10, 9, 30, 13, 20};
        int[] class4 = {10, 9, 30, 13, 20};
        int[] class5 = {10, 9, 30, 13, 20};

        ArrayList<int[]> schools = new ArrayList<int[]>();
        schools.add(class1);
        schools.add(class2);
        schools.add(class3);
        schools.add(class4);
        schools.add(class5);

//        // printing didn't go as plan because the arraylist contains arrays.
//        System.out.println(" For manual Debug use only" + schools);

        System.out.println("***************** type:1 ***********************");
        for (int i = 0; i < schools.size(); i++) {
            System.out.println("Class "+ (i+1) +": "); // Class --- print line
            for (int j : schools.get(i)) {
                System.out.print(j +", ");
            }
            System.out.println();
        }
        System.out.println("********************* type:2 *******************");

        for (int i = 0; i < schools.size(); i++) {
            for (int j : schools.get(i)) {
                System.out.print(j + ", ");
            }
            System.out.println();
        }
        System.out.println("***************** type:3  ***********************");

        for (int[] school : schools) {
            for (int j : school) {
                System.out.print(j + ", ");
            }
            System.out.println();
        }

    }
}
