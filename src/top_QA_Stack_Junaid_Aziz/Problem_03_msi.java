package top_QA_Stack_Junaid_Aziz;

public class Problem_03_msi {
    //Question 3: Write a program to reverse a given string.
    //The Input is: This is a string
    //Output should be: gnirts a si sihT
    public static void main(String[] args) {
        String str = "This is a string";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }
}
