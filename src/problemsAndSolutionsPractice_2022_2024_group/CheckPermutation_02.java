package problemsAndSolutionsPractice_2022_2024_group;

public class CheckPermutation_02 {

    public static void main(String[] args) {
        permute("", "ABC");
    }

    public static void permute(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                permute(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
            }
        }
    }
}


