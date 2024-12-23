package QA_Interview_Code_Mokol_2021_2024_NEED_UPDATE.string;

public class ReverseString {
    public static void main(String[] args) {
        String str="monirul islam";
        String rev ="";
        for (int i=str.length()-1;i>=0;i--){
            rev = rev +str.charAt(i);
        }
        System.out.println(rev);
    }
}
