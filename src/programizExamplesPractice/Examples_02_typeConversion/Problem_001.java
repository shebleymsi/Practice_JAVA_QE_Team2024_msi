package programizExamplesPractice.Examples_02_typeConversion;


public class Problem_001 {
    //Example 1: Convert char to String
    public static void main(String[] args) {
        char ch = 'c';
        String str = Character.toString(ch);
        // Alternatively
        // st = String.valueOf(ch);
        System.out.println("The string is: " + str);
    }

}
