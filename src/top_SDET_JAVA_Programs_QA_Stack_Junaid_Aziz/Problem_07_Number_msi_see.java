package top_SDET_JAVA_Programs_QA_Stack_Junaid_Aziz;

public class Problem_07_Number_msi_see {
    //Question 7: Write a program to swap the two number using StringBuilder class.
    //The Input is: 10 20
    //Output should be: 20 10
    public static void main(String[] args) {
        String input = "10 20";
        String[] parts = input.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(parts[1]).append(" ").append(parts[0]);
        System.out.println(sb.toString());
    }

}
