package rakibProblemsPractice.array05;

import java.util.Arrays;

public class ArrayfromString_14 {
    public static void main(String[] args) {

        String str = "My name is Geeks. Your name is Msi";
        String str1 = "My name is Geeks and Your name is Msi";

        String str3 = "This is an example";
        //Converts this string to a new character array.
        char[] charArray = str3.toCharArray();
        System.out.println(Arrays.toString(charArray));

        // split string by no space, which means it will split every character
        String[] strSplit = str.split("");
        System.out.println(Arrays.toString(strSplit));

        // split string by one space
        String[] strSplit1 = str.split(" ");
        System.out.println(Arrays.toString(strSplit1));

        // split string by dot character, since dot is a special regex character, it needs to be escaped
        String[] strSplit2 = str.split("\\.");
        System.out.println("+++++++"+Arrays.toString(strSplit2));

        // split string by dot followed by a space, escaping the dot
        String[] strSplit3 = str.split("\\. ");
        System.out.println("================"+Arrays.toString(strSplit3));

        // split string by the sequence "Geeks."
        String[] strSplit4 = str.split("Geeks\\.");  //eureka
        System.out.println(Arrays.toString(strSplit4));

        // split string str1 by the word "and"
        String[] strSplit5 = str1.split("and");
        System.out.println(Arrays.toString(strSplit5));


        //===============================================



    }
}
