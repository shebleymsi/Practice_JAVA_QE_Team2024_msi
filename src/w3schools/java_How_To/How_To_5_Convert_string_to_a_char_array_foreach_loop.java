package w3schools.java_How_To;

public class How_To_5_Convert_string_to_a_char_array_foreach_loop {
    public static void main(String[] args) {
        String myString = "Hello";
        char[] charArray = myString.toCharArray();
        for (char i : charArray) {
            System.out.println(i);
        }
        System.out.println("first element of the array" + charArray[0]);
    }
}
