package QA_InterviewCode_Capital_One_Bank_2021_2024.practise;
import java.util.HashMap;

public class exam {
    public static void main(String[]args){
        String str ="abcdeab";
        char[]arr=str.toCharArray();
        String subString =null;
        int subStringLength =0;

        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            char c = arr[i];
            if(!map.containsKey(c)){
            map.put(c,i);
        }else{
            i=map.get(c);
            map.clear();
        }
        if(map.size()>subStringLength){
            subStringLength=map.size();
            subString=map.keySet().toString();
        }}
        System.out.println("substring :"+ subString);
    }
}
