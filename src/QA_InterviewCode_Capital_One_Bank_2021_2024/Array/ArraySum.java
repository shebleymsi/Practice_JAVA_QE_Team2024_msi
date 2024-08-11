package QA_InterviewCode_Capital_One_Bank_2021_2024.Array;

public class ArraySum {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        int sum =0;
        for(int i =0;i<num.length;i++){
            sum = sum + num[i];
        }
        System.out.println(sum);
    }
}