package RakibProblemsPractice.StringProblems01;

import java.util.Arrays;
public class StringMethods01 {

    public static void main(String[] args) { // done

        //given String
        String str = "Hello World";

        printMessage(str);
        getLength(str);
        getToUpperCase(str);
        getToLowerCase(str);
        getCharAt(str);
        //getCharAtIndexOutOfBound(str);
        getCharAtIndexOutOfBoundExceptionHandle(str);
        getIndexByCharacter(str);
        getIndexByCharacter1(str);
        getIndexByCharacter2(str);
        getLastIndex(str);
        getSubString(str);
        getReplace(str);
        getTrim(str);

        getSplit(str);

        System.out.println("String starts with 'Hello': " + getStartsWith(str));
        System.out.println("String starts with 'Hello' (case-sensitive): " + getStartsWith1(str));

        System.out.println("String ends with 'World': " + getEndsWith(str));
        System.out.println("String ends with 'World' (case-sensitive): " + getEndsWith1(str));

        getContains(str);
        System.out.println("Contains 'World': " + getContains1(str));
        System.out.println("Contains 'World':  (case-sensitive): " + getContains2(str));

        getEqual(str);
        System.out.println("String equals 'Hello World': " + getEqual1(str));

        getEqualIgnoreCase(str);
        System.out.println("String equals ignore case 'hello world!': " + getEqualIgnoreCase1(str));

        getIsEmpty(str);
        getConcat(str);

    }


    // 0. print message
    public static void printMessage(String str) {
        System.out.println(str);
    }

    // 1. length of the given string
    public static void getLength(String str) {
        System.out.println("Length of the string: " + str.length());
    }

    // 2. toUpperCase() method
    public static void getToUpperCase(String str) {
        System.out.println("String in uppercase: " + str.toUpperCase());
    }

    // 2. toLowerCase() method
    public static void getToLowerCase(String str) {
        System.out.println("String in uppercase: " + str.toLowerCase());
    }


    //===================================== charAt() method =====================================================
    //4. charAt() method
    public static void getCharAt(String str) {
        System.out.println("Character at index 6: " + str.charAt(6));
    }

    //4.01. charAt() method --> index out of bound
    public static void getCharAtIndexOutOfBound(String str) {
        System.out.println("Character-at 13 index out of bound : " + str.charAt(12));
    }

    //4.01.01. charAt() method --> index out of bound
    public static void getCharAtIndexOutOfBoundExceptionHandle(String str) {
        try {
            System.out.println("Character-at 13 index out of bound exception handle : " + str.charAt(13));
        } catch (Exception e) {
            System.out.println("Index 13 is out String");
        }
    }

    //=============================================== getIndexByCharacter =============================================
    // 5. indexOf() method
    private static void getIndexByCharacter(String str) {
        System.out.println("Index of 'W': " + str.indexOf('W'));

    }

    // 5.1 indexOf() method use case-insensitive --> toLowerCase() ==> manual approach
    public static void getIndexByCharacter1(String str) {
        System.out.println("Index of 'W': " + str.toLowerCase().indexOf('w'));
    }

    // 5.2 indexOf() method use case-insensitive --> toLowerCase() ==> Dynamic approach whatever case you put
    public static void getIndexByCharacter2(String str) {
        System.out.println("Index of 'W': " + str.toLowerCase().indexOf("w".toLowerCase()));

    }

// ==============================================================================================================

    // 6. lastIndexOf() method
    public static void getLastIndex(String str) {
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

    }

    // 7. substring(6, 11) method
    public static void getSubString(String str) {
        System.out.println("Substring from index 6 to 11: " + str.substring(6, 11));
    }

    // 8. replace() method
    public static void getReplace(String str) {
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
    }

    // 9. trim() method --> remove white space
    public static void getTrim(String str) {
        String str2 = "           Hello World!          ";
        System.out.println("String after trimming: " + str2.trim());
    }

    // ==============================================================================================================
    // 10. split a string use by split() method
    // objective: Convert a string to an array by the use of split
    public static void getSplit(String str) {
        String str3 = "Hello World Java";
        // declare an array then assigning as value with split the String and stored the value inside that array
        String[] strArray = str3.split(" "); // regular expression ==> regex // here, split from ","

        // print by for-each loop
        for (String s : strArray) {
            System.out.println(s);
        }

        // or, print by Arrays.toString()
        System.out.println("print by toString method: " + Arrays.toString(strArray));
    }

    // ==============================================================================================================
    // 11. startsWith() method
    public static boolean getStartsWith(String str) {
        return str.startsWith("Hello");
    }

    public static boolean getStartsWith1(String str) {
        String prefix = "Hello";
        return str.toLowerCase().startsWith(prefix.toLowerCase());

    }

    // ==========================================================================================================
    // 12. endsWith() method
    public static boolean getEndsWith(String str) {
        return str.endsWith("World");
    }

    public static boolean getEndsWith1(String str) {
        String suffix = "world";
        return str.toLowerCase().endsWith(suffix.toLowerCase());

    }

    // ==========================================================================================================
    // 13. contains() method
    public static void getContains(String str) {
        System.out.println("String contains 'World': " + str.contains("World"));
    }

    public static boolean getContains1(String str) {
        return str.contains("World");
    }

    public static boolean getContains2(String str) {
        String contain = "world";
        return str.toLowerCase().contains(contain.toLowerCase());
    }

    // ==========================================================================================================
    // 14. equals() method
    public static void getEqual(String str) {
        String str4 = "Hello World";
        System.out.println("String equals 'Hello World': " + str.equals(str4));
    }

    public static boolean getEqual1(String str) {
        String str4 = "Hello World";
        return str.equals(str4);
    }

    // ==========================================================================================================
    // 15. equalsIgnoreCase() method
    public static void getEqualIgnoreCase(String str) {
        String str5 = "hello world";
        System.out.println("String equals ignore case 'hello world!': " + str.equalsIgnoreCase(str5));
    }

    public static boolean getEqualIgnoreCase1(String str) {
        String str6 = "hello world";
        return str.equalsIgnoreCase(str6);
    }

    // ==========================================================================================================
    // 16. isEmpty() method
    public static void getIsEmpty(String str) {
        System.out.println("String is empty: " + str.isEmpty());

    }

    // 17. concat() method
    public static void getConcat(String str) {
        System.out.println("Concatenation of two strings 'Hello' and 'World!': " + str.concat(" World!"));

    }

}

