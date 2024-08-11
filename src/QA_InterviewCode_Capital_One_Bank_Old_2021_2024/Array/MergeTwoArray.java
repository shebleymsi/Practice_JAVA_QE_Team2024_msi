package QA_InterviewCode_Capital_One_Bank_Old_2021_2024.Array;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 7, 9};
        int[] a2 = {2, 4, 6, 8, 10};
        int a1length = a1.length;
        int a2length = a2.length;
        int a3length = a1length + a2length;
        int[] a3 = new int[a3length];

        for (int i = 0; i < a1length; i++) {
            a3[i] = a1[i];
        }
        for (int i = 0; i < a2length; i++) {
            a3[a1length + i] = a2[i];
        }
        for (int i = 0; i < a3length; i++) {
            System.out.print(a3[i]+" ");
        }
    }
}
