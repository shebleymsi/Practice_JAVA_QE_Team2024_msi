package top_SDET_JAVA_Programs_Kushal_Parikh_CODE_FULL.sdet_02_strings;

public class SDET_06_find_all_permutations {
    //6.) Java program to find all permutations of a  given string
    public static void main(String[] args) {
        String str = "abc";
        permute(str, "");
    }

    static void permute(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permute(rem, prefix + str.charAt(i));
            }
        }
    }

}
