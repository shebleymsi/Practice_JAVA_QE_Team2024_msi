package xqe_top_SDET_JAVA_Programs_QA_Stack_Junaid_Aziz_2025;

public class Problem_04_ {
    //Question 4: Write a program to calculate the count of non-space characters in a string.
    //The Input is: This is a string
    //Output should be: 13
    public static void main(String[] args) {
        String input = "This is a string";
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                count = count + 1;
            }
            System.out.println("The count"+count); // then go to calculate for-loop by 1
        }

        System.out.println("The count of non-space characters is: " + count);
    }
}



