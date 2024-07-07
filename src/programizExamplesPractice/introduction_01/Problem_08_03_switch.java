package programizExamplesPractice.introduction_01;

public class Problem_08_03_switch {
    //Example 2: Check whether an alphabet is vowel or consonant using switch statement
    public static void main(String[] args) {
        char ch = 'z';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel");
                break;
            default:
                System.out.println(ch + " is a consonant");
        }
    }
}
