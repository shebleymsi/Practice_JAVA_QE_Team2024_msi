package top_QA_Stack_Junaid_Aziz;

import java.util.HashSet;

public class Problem_01_ {
    //Question 1: Write a program to find duplicate characters in a given String.
    //The Input is: hackerearth
    //Output should be: e a r h
    public static void main(String[] args) {
        String str = "hackerearth";

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            if (set.add(str.charAt(i)) == false) {
                System.out.print(str.charAt(i) + " ");
            }
            //System.out.println(set); //use for debug
        }
        //System.out.println(set); // use for debug
    }


}


