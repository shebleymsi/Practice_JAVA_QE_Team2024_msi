package top_QA_Stack_Junaid_Aziz;

public class Problem_03_ {
    //Question 3: Write a program to reverse a given string.
    //The Input is: This is a string
    //Output should be: gnirts a si sihT
        public static void main(String[] args) {
            String name = "This is a string";
            reverseString(name);

        }

        public static void reverseString(String name) {
            String reverse = "";
            for (int i = 0; i < name.length(); i++) {
                reverse = name.charAt(i) + reverse;
                //System.out.println(reverse);
            }
            System.out.println(reverse);
        }
}
