package GroupProblemsPractice_2024.group_06_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithAraay_03_01 { //done
    public static void main(String[] args) {
        // Initialize arrays for different classes
        int[] class1 = {11, 23, 44, 22, 55};
        int[] class2 = {10, 9, 30, 13, 20};
        int[] class3 = {10, 9, 30, 13, 20};
        int[] class4 = {10, 9, 30, 13, 20};
        int[] class5 = {10, 9, 30, 13, 20, 30};

        // Direct way to add array as a member in an ArrayList
        ArrayList<int[]> schools = new ArrayList<>(Arrays.asList(class1, class2, class3, class4, class5));

        // Print the ArrayList of arrays using Arrays.toString()
        for (int[] school : schools) {
            System.out.println(Arrays.toString(school));
        }

        System.out.println("***************** type:1 ***********************");
        for (int i = 0; i < schools.size(); i++) {
            System.out.println("Class "+ (i+1) +": "); // Class --- print line
            for (int j : schools.get(i)) {
                System.out.print(j +", ");
            }
            System.out.println();
        }

    }
}
