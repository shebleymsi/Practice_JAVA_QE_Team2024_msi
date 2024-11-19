package QA_Interview_Code_Mokol_2021_2024.string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String st1 ="cat";
        String st2 ="mct";
        checkString(st1,st2);
    }
    public static void checkString(String a,String b){
        boolean status;
        if(a.length() != b.length()){
            status =false;
        }else{
            char[]arr1 = a.toLowerCase().toCharArray();
            char[]arr2 = b.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            status= Arrays.equals(arr1,arr2);
        }
        System.out.println(a + " is Anagram of : " + b + " = "+status);
    }
}
