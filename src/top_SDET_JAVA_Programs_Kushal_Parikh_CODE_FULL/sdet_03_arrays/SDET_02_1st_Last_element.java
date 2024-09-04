package top_SDET_JAVA_Programs_Kushal_Parikh_CODE_FULL.sdet_03_arrays;

import java.util.ArrayList;

public class SDET_02_1st_Last_element {
    //Find first and last element of  Arraylist
    //Output:
    //First element: Apple
    //Last element: Elderberry
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Elderberry");

        if (!arrayList.isEmpty()) {
            String firstElement = arrayList.get(0);
            System.out.println("First element: " + firstElement);

            String lastElement = arrayList.get(arrayList.size() - 1);
            System.out.println("Last element: " + lastElement);

        } else {
            System.out.println("The ArrayList is empty.");
        }
    }
}
