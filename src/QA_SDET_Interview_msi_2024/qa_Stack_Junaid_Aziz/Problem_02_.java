package QA_SDET_Interview_msi_2024.qa_Stack_Junaid_Aziz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class Problem_02_ {
    //Question 2: Write a program to remove duplicate characters in a given String.
    //The Input is: hackerearth
    //Output should be: arctehk
    public static void main(String[] args) {
        String str = "hackerearth";

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        System.out.println(set); // [a, r, c, t, e, h, k]

        // Convert the Set to a List [ as out put: arctehk ]
        List<Character> list = new ArrayList<>(set);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

    }

}