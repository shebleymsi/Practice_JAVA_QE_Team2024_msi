package top_SDET_JAVA_Programs_Tushar_Desai_TCS_SMART_CODE;

public class TCS_27_CountCharacter {
    //27. Count the Occurrences of a Character in a String
    public static void main(String[] args) {
        String str = "Automation";
        char ch = 'a';
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }
        System.out.println(count);
    }

}
