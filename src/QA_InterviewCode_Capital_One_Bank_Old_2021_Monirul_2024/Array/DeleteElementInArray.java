package QA_InterviewCode_Capital_One_Bank_Old_2021_Monirul_2024.Array;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 12, 7, 3, 8};
        System.out.print("Enter Element to be deleted : ");
        int elem = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem){
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
        }}}
        System.out.println("Elements -- " );
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(" " + arr[i]);
        }}}
//*****************************************************
      // Delete Elements By Index.
 /*      int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original Array : " + Arrays.toString(arr));
        int rIndex = 3;
        for (int i = rIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("After removing element: " + Arrays.toString(arr));
    }}
*/
//*****************************************************
/*        Scanner in = new Scanner(System.in);
        int[] intArr = {1, 2, 5, 12, 7, 3, 8};
        System.out.print("Enter Element to be deleted : ");
        int elem = in.nextInt();

        for(int i = 0; i < intArr.length; i++){
            if(intArr[i] == elem){
                for(int j = i; j < intArr.length - 1; j++){
                    intArr[j] = intArr[j+1];
                }
                break;
            }}
        System.out.println("Elements -- " );
        for(int i = 0; i < intArr.length; i++){
            System.out.print(" " + intArr[i]);
        }}}*/
