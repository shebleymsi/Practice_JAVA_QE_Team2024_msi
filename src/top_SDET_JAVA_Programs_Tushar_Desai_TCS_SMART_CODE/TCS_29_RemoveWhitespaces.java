package top_SDET_JAVA_Programs_Tushar_Desai_TCS_SMART_CODE;

public class TCS_29_RemoveWhitespaces {
    //29. Remove All Whitespaces from a String
    public static void main(String[] args) {
        String str = " A u t o m a t i o n ";
        String result = str.replaceAll("\\s+", "");
        System.out.println(result);
    }

}
