package xqe_JavaMathNotebook_2025.xw3school_java_How_To;

public class How_To_5_Convert_string_to_a_char_array_for_loop {
    public static void main(String[] args) {
        String myString = "Hello";
        char[] charArray = myString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
        System.out.println("first element of the array" + charArray[0]);
    }
}
