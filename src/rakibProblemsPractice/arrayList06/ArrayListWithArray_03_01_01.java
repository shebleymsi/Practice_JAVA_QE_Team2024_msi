package rakibProblemsPractice.arrayList06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithArray_03_01_01 { // Advanced java less important now

    public static void main(String[] args) {
        // Initialize arrays for different classes
        int[] class1 = {11, 23, 44, 22, 55};
        int[] class2 = {10, 9, 30, 13, 20};
        int[] class3 = {10, 9, 30, 13, 20};
        int[] class4 = {10, 9, 30, 13, 20};
        int[] class5 = {10, 9, 30, 13, 20};

        // Convert arrays to ArrayLists
        List<Integer> class1List = new ArrayList<>(convertArrayToArrayList(class1));
        List<Integer> class2List = new ArrayList<>(convertArrayToArrayList(class2));
        List<Integer> class3List = new ArrayList<>(convertArrayToArrayList(class3));
        List<Integer> class4List = new ArrayList<>(convertArrayToArrayList(class4));
        List<Integer> class5List = new ArrayList<>(convertArrayToArrayList(class5));

        // Print the ArrayLists
        System.out.println("Class 1: " + class1List);
        System.out.println("Class 2: " + class2List);
        System.out.println("Class 3: " + class3List);
        System.out.println("Class 4: " + class4List);
        System.out.println("Class 5: " + class5List);
    }

    // Method to convert array to ArrayList
    public static List<Integer> convertArrayToArrayList(int[] array) {
        // Convert array to List and then create an ArrayList from the List
        return new ArrayList<>(Arrays.asList(Arrays.stream(array).boxed().toArray(Integer[]::new)));
    }
}

