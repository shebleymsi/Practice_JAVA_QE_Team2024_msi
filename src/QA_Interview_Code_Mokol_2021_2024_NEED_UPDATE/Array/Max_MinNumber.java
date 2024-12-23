package QA_Interview_Code_Mokol_2021_2024_NEED_UPDATE.Array;
public class Max_MinNumber {
    public static void main(String[] args) {
    int[] a = new int[]{9, 5, 6, 4, 8, 7, 12};
    int min = a[0];
    int max = a[0];
        for(int i = 1; i < a.length; ++i) {
        if (min > a[i]) {
            min = a[i];
        }}
        System.out.println("Minimum Number : " + min);
        for(int i = 1; i < a.length; ++i) {
        if (max < a[i]) {
            max = a[i];
        }}
        System.out.println("Maximum Number : " + max);
  }}
//===================================================================
      //How many odd and Even Number.
/*       int[]num ={1,2,3,45,6,7,8,9};
        System.out.print("even : ");
        for (int i=0;i<num.length;i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i]+" ");
            }}
        System.out.println();
        System.out.print("odd : ");
        for (int i=0;i<num.length;i++) {
            if (num[i] % 2 != 0) {
                System.out.print(num[i]+" ");
            }}}}*/
