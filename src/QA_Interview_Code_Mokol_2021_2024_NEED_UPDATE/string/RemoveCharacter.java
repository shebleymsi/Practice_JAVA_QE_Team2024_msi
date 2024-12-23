package QA_Interview_Code_Mokol_2021_2024_NEED_UPDATE.string;

public class RemoveCharacter {
    public static void main(String[] args) {
        System.out.println(removeChar("nice",'c'));
    }
    public static String removeChar(String str,char c){
        if(str == null)
        return null;
        return str.replaceAll(Character.toString(c)," ");
    }}
