package top_SDET_JAVA_Programs_Kushal_Parikh.sdet_03_arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SDET_05_Remove_Duplicates_From_ArrayList {
    //Remove duplicates from an  ArrayList
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(6);
        arrayList.add(2);
        arrayList.add(5);

        ArrayList<Integer> uniqueList = removeDuplicates(arrayList);
        System.out.println("ArrayList with duplicates removed:");
        for (int num : uniqueList) {
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer>
    removeDuplicates(ArrayList<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

}
