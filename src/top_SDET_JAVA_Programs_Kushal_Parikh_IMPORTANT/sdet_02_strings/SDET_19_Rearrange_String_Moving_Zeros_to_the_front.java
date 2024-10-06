package top_SDET_JAVA_Programs_Kushal_Parikh_IMPORTANT.sdet_02_strings;

public class SDET_19_Rearrange_String_Moving_Zeros_to_the_front {
    //19.) Java program to gives Output:  “00003241212” for the Input String Str = “32400121200”
    //Formatted output: 00003241212
    public static void main(String[] args) {
        String input = "32400121200";
        String output = rearrangeString(input);
        System.out.println("Formatted output: " + output);
    }

    public static String rearrangeString(String input) {
        StringBuilder zeros = new StringBuilder();
        StringBuilder nonZeros = new StringBuilder();

        // Separate zeros and non-zero digits
        for (char c : input.toCharArray()) {
            if (c == '0') {
                zeros.append(c);
            } else {
                nonZeros.append(c);
            }
        }

        // Concatenate zeros at the front followed by non-zero digits
        return zeros.toString() + nonZeros.toString();
    }
}
