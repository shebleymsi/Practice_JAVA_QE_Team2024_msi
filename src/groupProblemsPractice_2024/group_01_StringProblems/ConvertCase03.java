package groupProblemsPractice_2024.group_01_StringProblems;

public class ConvertCase03 { //done
    public static void main(String[] args) {
        String str = "Hello World!";

        String result1 = convertToUpperCase(str);
        System.out.println("The string after converting to uppercase is: " + result1);

        String result2 = convertToLowerCase(str);
        System.out.println("The string after converting to lowercase is: " + result2);
    }

    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }

    public static String convertToLowerCase(String str) {
        return str.toLowerCase();
    }

}
