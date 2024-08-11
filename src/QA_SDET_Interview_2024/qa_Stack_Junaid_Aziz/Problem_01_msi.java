package QA_SDET_Interview_2024.qa_Stack_Junaid_Aziz;

import java.util.HashSet;

public class Problem_01_msi {
    //Q: Print only duplicate Array.
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 1, 7};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (set.add(array[i]) == false) {
                System.out.print(array[i] + " ");
            }
            //System.out.println(set); //use for debug
        }
        //System.out.println(set); // use for debug
    }
}
