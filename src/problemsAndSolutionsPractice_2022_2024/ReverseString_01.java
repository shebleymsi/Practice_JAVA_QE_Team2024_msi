package problemsAndSolutionsPractice_2022_2024;
public class ReverseString_01 {
    public static void main(String[] args) {
        String name = "James";
        reverseString1(name);
    }


    public static void reverseString1(String name) {
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
            System.out.println(reverse);
        }
        System.out.println(reverse);
    }

}
