package top_SDET_JAVA_Programs_Kushal_Parikh_IMPORTANT.sdet_02_strings;

public class SDET_18_Rearrange_String_Moving_Zeros_to_the_End {
    //18.) Java program to gives Output:  “32412120000” for the Input String Str = “32400121200”
    //Output: 32412120000
    public static void main(String[] args) {
        String input = "32400121200";
        String output = rearrangeDigits(input);
        System.out.println("Output: " + output);
    }

    public static String rearrangeDigits(String input) {
        StringBuilder nonZeros = new StringBuilder();
        StringBuilder zeros = new StringBuilder();

        // Separate zeros and non-zero digits
        for (char c : input.toCharArray()) {
            if (c == '0') {
                zeros.append(c);
            } else {
                nonZeros.append(c);
            }
        }

        // Concatenate non-zero digits followed by zeros
        return nonZeros.toString() + zeros.toString();
    }
}
