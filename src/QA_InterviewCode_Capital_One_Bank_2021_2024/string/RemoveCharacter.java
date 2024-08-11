package QA_InterviewCode_Capital_One_Bank_2021_2024.string;

public class RemoveCharacter {
    public static void main(String[] args) {
        System.out.println(removeChar("nice",'c'));
    }
    public static String removeChar(String str,char c){
        if(str == null)
        return null;
        return str.replaceAll(Character.toString(c)," ");
    }}
