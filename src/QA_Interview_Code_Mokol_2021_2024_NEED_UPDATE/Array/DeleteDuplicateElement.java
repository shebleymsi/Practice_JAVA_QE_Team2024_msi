package QA_Interview_Code_Mokol_2021_2024_NEED_UPDATE.Array;
import java.util.HashSet;
public class DeleteDuplicateElement {
    public static void main(String[] args) {
        int[] a1 ={1,2,3,4,2,1,7};
        HashSet<Integer> set = new HashSet<>();
        for (int i=0 ; i< a1.length;i++){
            set.add(a1[i]);
            }
        for (Integer ch : set){
            System.out.print(ch+" ");
        }}}
