package QA_Interview_Code_Mokol_2021_2024_NEED_UPDATE.Array;

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