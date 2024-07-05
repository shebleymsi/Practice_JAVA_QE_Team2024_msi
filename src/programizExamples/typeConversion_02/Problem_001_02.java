package programizExamples.typeConversion_02;


import java.util.Arrays;

public class Problem_001_02 {
    // Example 3: Convert String to char array
    // This is great
    // [T, h, i, s,  , i, s,  , g, r, e, a, t]
    public static void main(String[] args) {
        String st = "This is great";

        char[] chars = st.toCharArray();
        System.out.println(Arrays.toString(chars));
    }

}
