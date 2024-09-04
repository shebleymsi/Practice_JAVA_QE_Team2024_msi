package QA_InterviewCode_Capital_One_Bank_Old_2021_Monirul_2024.Array;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] num ={1,2,4,6,8,9,2,6};
        int temp;
      for (int i =0;i<num.length/2;i++){
      temp=num[i];
      num[i]= num[num.length-1-i];
      num[num.length-1-i] =temp;
  }
      for (int i=0;i< num.length;i++){
      System.out.print(num[i]+" ");
  }
  }
}