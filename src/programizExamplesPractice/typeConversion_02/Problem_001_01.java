package programizExamplesPractice.typeConversion_02;


public class Problem_001_01 {
    //Example 2: Convert char array to String
    // char[] ch = {'a', 'e', 'i', 'o', 'u'};
    // aeiou
    public static void main(String[] args) {
        char[] ch = {'a', 'e', 'i', 'o', 'u'};

        String st = String.valueOf(ch);
        System.out.println(st);

        String st2 = new String(ch);
        System.out.println(st2);
    }

}
