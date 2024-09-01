package top_SDET_JAVA_Programs_QA_Stack_Junaid_Aziz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Problem_02_msi {
    //Question 2: Write a program to remove duplicate characters in a given String.
    //The Input is: hackerearth
    //Output should be: arctehk
    public static void main(String[] args) {
        String str = "hackerearth";
        char[] chars = str.toCharArray();
       System.out.println(Arrays.toString(chars));

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            set.add(chars[i]);
        }
        System.out.println(set); // [a, r, c, t, e, h, k]

        // Convert the Set to a List [ as out put: arctehk ]
        List<Character> list = new ArrayList<>(set);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

    }

}