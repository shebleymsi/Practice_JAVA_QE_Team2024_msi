package problemsAndSolutionsPractice_2022_2024;
public class ReverseString {
    public static void main(String[] args) {
        String name = "James";
        reverseString(name);

    }

    public static void reverseString(String name) {
        String reverse = "";
        for (int i = 0; i < name.length(); i++) {
            reverse = name.charAt(i) + reverse;
            //System.out.println(reverse);
        }
        System.out.println(reverse);
    }

}
