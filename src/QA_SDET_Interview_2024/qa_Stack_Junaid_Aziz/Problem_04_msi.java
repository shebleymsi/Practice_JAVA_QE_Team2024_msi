package QA_SDET_Interview_2024.qa_Stack_Junaid_Aziz;

public class Problem_04_msi {
    //Question 4: Write a program to calculate the count of non-space characters in a string.
    //The Input is: This is a string
    //Output should be: 13
    public static void main(String[] args) {
        String name = "This is a string";
        nonSpaceCharacters(name);
    }

    public static void nonSpaceCharacters(String name) {
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != ' ') {
                count = count + 1;
            }
        }
        System.out.println("The count of non-space characters is: " + count);
    }

}
