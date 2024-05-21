package learnJavaQEWinter2022.RakibProblems.StringProblems01;

public class SplitString {

        public static void main(String[] args) {
            String str = "Hello World!";
            String[] splitStr = splitString(str);
            System.out.println("The string after splitting is: ");

            System.out.println(java.util.Arrays.toString(splitStr));
        }

        public static String[] splitString(String str) {
            return str.split(" ");
        }
}
