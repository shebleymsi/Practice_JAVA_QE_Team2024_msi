package QA_InterviewCode_2021_2024.Array;

public class MissingNumber {
    public static void main(String[] args) {
        int [] num ={1,2,3,4,5,6,7,9};
        int mNumber = num.length+1;

        int TotalSum = mNumber*(mNumber+1)/2;
        System.out.println("Total : "+TotalSum);
        int sum =0;
        for (int i=0;i< num.length;i++){
            sum = sum+ num[i];
        }
        System.out.println("Missing Number : "+(TotalSum-sum));
       // System.out.println("Sum : "+ sum);
    }
}
