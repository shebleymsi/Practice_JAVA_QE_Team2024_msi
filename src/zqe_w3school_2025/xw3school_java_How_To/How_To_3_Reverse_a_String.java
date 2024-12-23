package zqe_w3school_2025.xw3school_java_How_To;

public class How_To_3_Reverse_a_String {
    public static void main(String[] args) {
        String originalString = "Hello";
        String reverseString = "";
        for (int i = 0; i < originalString.length(); i++) {
            reverseString = originalString.charAt(i) + reverseString;
        }
        System.out.println(reverseString);
    }
}
